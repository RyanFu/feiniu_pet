package com.lvmama.businesses.sweb;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.lvmama.businesses.review.util.KeyWordUtils;
import com.lvmama.comm.businesses.po.review.BbsPreForumPost;
import com.lvmama.comm.businesses.service.review.BbsService;
import com.lvmama.comm.pet.po.pub.ComLog;
import com.lvmama.comm.vo.Constant;

@Results({
	 @Result(name = "bbscontent", location = "/WEB-INF/pages/web/review/bbscontent.jsp")
})
public class BbsContentAction extends ContentAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1233333333442342L;
	@Autowired
	private BbsService bbsService;

	@Action("/bbsContent/query")
	public String query(){
		     super.initParam();
		    pagination=initPage();
		    pagination.setCurrentPage(pagination.getCurrentPage());
			pagination.setTotalResultSize(bbsService.countForBbsPreForumPost(param));
			if(pagination.getTotalResultSize()>0){
				 param.put("start", pagination.getStartRows()-1);
				 param.put("end", pagination.getPageSize());
				  List<BbsPreForumPost>  bbsPreForumPostList=bbsService.queryBbsPreForumPostByParam(param);
				 pagination.setAllItems(bbsPreForumPostList);
			}
			pagination.buildUrl(getRequest());  
 		 return "bbscontent"; 
	}
	@Action("/bbsContent/update")
	public void update(){
		if(StringUtils.isNotBlank(arrayStr)){
			List<String[]> list=parseArray(arrayStr);
			for(String[] m:list){
				 Map<String,Object> param=new HashMap<String, Object>();
				 param.put("pid", m[0]);
				 param.put("reviewstatus", m[1]);
			     BbsPreForumPost oldbbsPost=bbsService.queryForBbsPreForumPostById(Integer.valueOf(m[0]));
				if (null != oldbbsPost
						&& (!oldbbsPost.getReviewstatus().equals(m[1]))) {
					if (m[1].equals(Constant.REVIEW_STATUS.black.getCode())) {
						param.put("invisible", "-1");// 不显示
					}
					if (oldbbsPost.getReviewstatus().equals(
							Constant.REVIEW_STATUS.black.getCode())) {
						param.put("invisible", "0");// 显示
					}
					// 更新
					bbsService.updateForBbsPreForumPost(param);
					// 日志
					ComLog comlog = new ComLog();
					comlog.setObjectId(Long.valueOf(m[0]));
					comlog.setObjectType(KeyWordUtils.BBSCONTENT);
					comlog.setCreateTime(new Date());
					comlog.setContent("状态改为"
							+ Constant.REVIEW_STATUS.getCnNameByCode(m[1]));
					comlog.setOperatorName(super.getSessionUserName());
					comLogService.addComLog(comlog);
				}
				
			}
			this.sendAjaxMsg("true");
		}
		this.sendAjaxMsg("false");
	}
	
	@Override
	public String getMemcachPageSizeKey() {
		return KeyWordUtils.BUSSINESS_PAGE_SIZE_+KeyWordUtils.BBSCONTENT;
	}
	 
}
