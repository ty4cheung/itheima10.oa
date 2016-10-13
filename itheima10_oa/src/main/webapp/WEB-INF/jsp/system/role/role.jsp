<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style/style.css"/>
<%@ include file="/WEB-INF/jsp/common/common.jsp" %>
<script language="javascript" src=${pageContext.request.contextPath}/js/role.js></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<BODY>
	<table border="0" height="600px" align="left">

		<tr>
			<td width="230px" align="left" valign="top"
				style="BORDER-RIGHT: #999999 1px dashed">
				<ul id="roleTree" class="tree" style="width: 230px; overflow: auto;"></ul>
			</td>
		</tr>
	</table>

	<div class="addnodes" id="rMenu"
		style="position: absolute; display: none; overflow:hidden;">
		<ul>
			<li id="addFolder" style="background: url(${pageContext.request.contextPath}/css/images/jia.jpg) 10px 5px no-repeat;border-bottom:1px solid #8ab2e6;cursor:pointer;" onclick="addTreeNode();">增加节点</li>
			<li id="addFile" style="background: url(${pageContext.request.contextPath}/css/images/jia.jpg) 10px 5px no-repeat;border-bottom:1px solid #8ab2e6;cursor:pointer;" onclick="removeTreeNode();">删除节点</li>
			
		</ul>
	</div>
</BODY>
</html>