<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'UserAdd.jsp' starting page</title>
    
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
   <form>
   	<input type="text" name="userName"/>
   	<div></div>
   	<input type="text" name="password"/>
   	<div></div>
   	<input type="text" name="sex"/>
   	<input type="text" name="userPhone"/>
   	<input type="text" name="userBlogAddress"/>
   	<input type="text" name="userBirth"/>
   	<input type="text" name="userRole"/>
   	<input type="submit" value="submit"/>
   </form>
  </body>
  <script>
  
  </script>
</html>
