<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>User Manage</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form method="request" action="checkUser.action">
		用户名搜索：<input type="text" name="search"/>
		<input type="submit" value="submit"/>
	</form>
	<a href="UserAdd.jsp">添加用户</a>
	<table>
		<tr>
			<td>用户名</td>
			<td>性别</td>
			<td>电话</td>
			<td>博客地址</td>
			<td>生日</td>
			<td>用户角色</td>
			<td></td>
		</tr>

		<s:iterator value="users">
			<tr>
				<td><s:property value="user.userName"/></td>
				<td><s:property value="user.sex"/></td>
				<td><s:property value="user.userPhone"/></td>
				<td><s:property value="user.userBlogAddress"/></td>
				<td><s:property value="user.userBirth"/></td>
				<td><s:property value="user.userRole"/></td>
				<td><s:submit value="删除" action="deleteUser.do"/>
				<s:submit value="修改" action="modifyUser.jsp"/></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
