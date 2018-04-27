<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>adminLogin</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
      <script type="text/javascript" src="md5.js"></script>
  </head>
  
 <body>

<!--登陆和注册页面均实现了md5密码加密存储进数据库，无需解密，直接对比即可-->

<div >
    <form id="login-form" action="adminlogin.action" >
        <p>
            <label>用户名</label>
            <input type="text" name="user.username" required="true"/>
        </p>
        <p>
            <label>密码</label>
            <input id="pwd" type="password" name="user.password"  required="true"/>
        </p>
        <p>
            <button type="submit" onclick="md5()" class="w3-btn w3-section w3-teal w3-ripple">登陆</button>
        </p>
    </form>


</div>

<script>
    function md5(){
        var hash=hex_md5(document.getElementById("pwd").value);
        document.getElementById("pwd").value=hash;
    }
</script>
</body>
</html>
