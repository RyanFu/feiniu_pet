﻿<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>亲子游推荐_亲子游线路,价格_亲子游去哪里好【暑假 出国】-驴妈妈旅游网</title>
<meta name="keywords" content="亲子游，香港，线路 " />
<meta name="description" content="亲子游想去哪就去哪儿,这里有香港亲子游线路 ,精选香港亲子游旅游路线价格,告诉您暑假亲子游去哪里好,选择我们就是品质的保证。《自助游行天下，就找驴妈妈》" />
<link rel="stylesheet" href="http://www.lvmama.com/zt/promo/qingshen/css/index.css">
<link rel="stylesheet" href="http://www.lvmama.com/zt/000global/styles/zt_global.css" >
<script src="http://pic.lvmama.com/js/jquery-1.7.js"></script>
<script src="http://www.lvmama.com/zt/promo/qingshen/js/index.js"></script>
<base target="_blank">
<!--[if IE 6]> 
<script type="text/javascript" src="http://pic.lvmama.com/js/zt/DD_belatedPNG.js"></script> 
<script>DD_belatedPNG.fix('.navA_1,.navA_2,.navA_3');</script> 
<![endif]--> 
</head>

<body>
<!--专题公共头部START-->
<script src="http://www.lvmama.com/zt/000global/js/ztTopMenu.js" type="text/javascript"></script>
<!--专题公共头部END-->
<div class="body_bg">
<div class="main_all">
	<div class="banner">
    	<h1></h1>
    </div>
	<div class="main_box">
    	<div class="mainL">
        
        	<div class="nav_box">
                <ul class="nav">
                    <li class="navIndex"><a class="navA_1" href="index.html" target="_self"></a></li>
                    <li><a class="navA_2" href="tese.html" target="_self"></a></li>
                    <li><a class="navA_3" href="http://www.lvmama.com/zt/lvyou/chujingyou/" ></a></li>
                </ul>
                <span class="run"></span>
            </div>
			<div class="mainBorder">
            	<ul class="rxy_tab">
                <@s.iterator value="map.get('${station}_rx')" status="st">
           			<@s.if test="#st.isFirst()">
            		<li class="rxy_tab_li">${title?if_exists}</li>
            		</@s.if>
            		<@s.else>
                	<li>${title?if_exists}</li>
            		</@s.else>
        		</@s.iterator>
           		</ul>
                 		<@s.iterator value="map.get('${station}_rx')" status="st">
            <@s.if test="#st.isFirst()">
            <div class="rxy_tab_list" style="display:block;">
                <ul class="rxy_cp_list">
               		<@s.iterator value="map.get('${station}_rx_${st.index + 1}')" status="sts">
                    <li>
                        <div class="tm_box tm_box_bg"></div>
                        <dl class="tm_box">
                            <dt>${bakWord1?if_exists}</dt>
                            <dd>${bakWord3?if_exists}</dd>
                        </dl>
                        <a href="${bakWord2?if_exists}"><img src="${imgUrl?if_exists}" width="228" height="206" alt=""></a>
                        <p class="cp_name"><span>${memberPrice?if_exists?replace(".0","")}</span><a href="${url?if_exists}">${title?if_exists}</a></p>
                    </li>
                    </@s.iterator>

                </ul>
                <p class="rxy_gd">
                    <a href="${bakWord1?if_exists}">查看更多>></a>
                </p>
            </div>
            </@s.if>
            <@s.else>
            <div class="rxy_tab_list">
                <ul class="rxy_cp_list">
                    <@s.iterator value="map.get('${station}_rx_${st.index + 1}')" status="sts">
                    <li>
                        <div class="tm_box tm_box_bg"></div>
                        <dl class="tm_box">
                            <dt>${bakWord1?if_exists}</dt>
                            <dd>${bakWord3?if_exists}</dd>
                        </dl>
                        <a href="${bakWord2?if_exists}"><img src="${imgUrl?if_exists}" width="228" height="206" alt=""></a>
                        <p class="cp_name"><span>${memberPrice?if_exists?replace(".0","")}</span><a href="${url?if_exists}">${title?if_exists}</a></p>
                    </li>
                    </@s.iterator>
                </ul>
                <p class="rxy_gd">
                    <a href="${bakWord1?if_exists}">查看更多>></a>
                </p>
            </div>
            </@s.else>
        </@s.iterator> 
        	</div>
        </div>
        
        <div class="mainR">
        	<div class="rxy_right_top">
            <@s.iterator value="map.get('${station}_tp2')" status="st">
        	<a href="${url?if_exists}"><img src="${imgUrl?if_exists}" width="191" height="107" alt=""></a>
            <h3>${title?if_exists}</h3>
            <p><b>${bakWord1?if_exists}：</b>${bakWord2?if_exists}</p>
            <a class="rxy_right_tj" href="${url?if_exists}">查看详情</a>
            </@s.iterator>
        	</div>
        <ul class="rxy_right_list">
        	<@s.iterator value="map.get('${station}_tp1')" status="st">
        	<li><a href="${url?if_exists}"><img src="${imgUrl?if_exists}" width="190" height="210" alt=""></a></li>
           	</@s.iterator>
        </ul>
        </div>
    </div>
    <@s.iterator value="map.get('${station}_tp3')" status="st">
    <a class="imgBot" href="${url?if_exists}"><img src="${imgUrl?if_exists}" width="980" height="90" alt=""></a>
    </@s.iterator>
</div>








<div class="main_b ">
	<div class="hd_title">
    	<p></p>
        <h3>以下活动正在进行</h3>
    </div>
    <ul class="hd_list">
    	<@s.iterator value="map.get('${station}_tp')" status="st">
    	<li><a href="${url?if_exists}"><img src="${imgUrl?if_exists}" width="224" height="160" alt=""></a></li>
		</@s.iterator>
    </ul>
    <script src="http://www.lvmama.com/zt/000global/js/ztFooter.js" type="text/javascript"></script>
</div>
</div>

<script>

</script>

<script type="text/javascript" src="http://pic.lvmama.com/js/common/losc.js"></script>
</body>
</html>
