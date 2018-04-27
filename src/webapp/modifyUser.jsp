<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Modify User</title>

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
<!-- 使用session获取用户并对其修改 -->
	<s:form action="modifyUser" method="post">
	<%-- <%User editUser = session.getAttribute("editUser");%> --%>
		用户名：<s:textfield id="userName" type="text" name="userName" value="editUser.userName"/>
		<!-- <div id="errMsg1"></div> -->
		性别：<s:password type="text" name="sex" /> 
		电话：<s:textfield type="text" name="userPhone" />
		博客地址：<s:textfield type="text" name="userBlogAddress" />
		生日：<s:textfield type="text" name="userBirth" /> 
		角色：<s:textfield type="text" name="userRole" /> 
		<s:submit value="修改" />
	</s:form>
</body>
<!-- <script type="text/javascript">
function checkUserName(){
	var userName = document.getElementById("userName").value;
	if(userName == 0){
		
	}
}
</script> -->
</html>
