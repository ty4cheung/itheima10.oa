<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/blue/pageCommon.css"/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/zTreeStyle/zTreeStyle.css"/>
<script language="javascript" src=${pageContext.request.contextPath}/js/jquery-1.4.2.js></script>
<script language="javascript" src=${pageContext.request.contextPath}/js/jquery-ztree-2.5.js></script>
<script language="javascript" src=${pageContext.request.contextPath}/js/jquery-plugin-confirm.js></script>

<script type="text/javascript">
	$().ready(function(){
		// 加载window.confirm的cha jian
		$.oaconfirm();
	});
</script>
