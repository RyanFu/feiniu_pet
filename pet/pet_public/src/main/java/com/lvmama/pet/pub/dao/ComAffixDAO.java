/**
 * 
 */
package com.lvmama.pet.pub.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lvmama.comm.BaseIbatisDAO;
import com.lvmama.comm.pet.po.pub.ComAffix;

/**
 * 
 * @author yangbin
 *
 */
public class ComAffixDAO extends BaseIbatisDAO{

	public Long insert(ComAffix affix){
		return (Long)super.insert("COM_AFFIX.insert", affix);
	}
	
	public List<ComAffix> selectByParam(Map parameter){
		return super.queryForList("COM_AFFIX.selectByParam", parameter);
	}
	
	public Long selectCountByParam(Map parameter){
		Map map=(Map)((HashMap)parameter).clone();
		if(map.containsKey("maxResult")){
			map.remove("maxResult");
		}
		if(map.containsKey("skipResult")){
			map.remove("skipResult");
		}
		return (Long)super.queryForObject("COM_AFFIX.selectCountByParam",map);
	}
	
	
	public ComAffix selectByPrimary(Long affixId){
		ComAffix affix=new ComAffix();
		affix.setAffixId(affixId);
		return (ComAffix)super.queryForObject("COM_AFFIX.selectByPrimary",affix);
	}
	
	public void delete(ComAffix affix){
		super.delete("COM_AFFIX.delete", affix);
	}
	
}
