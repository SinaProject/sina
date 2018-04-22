<%--
  Created by IntelliJ IDEA.
  User: tanshangou
  Date: 2018/4/19
  Time: 下午10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://cdn.w3schools.wang/w3.css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Register Page</title>
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
    <script type="text/javascript" src="md5.js"></script>
</head>
<body>

<div class="w3-container w3-half w3-margin-top">
    <form id="login-form" action="login.action" class="w3-container w3-card-4">
        <p>
            <label>用户名</label>
            <input type="text" name="user.username"  class="w3-input" style="width:90%" required="true"/>
        </p>
        <p>
            <label>密码</label>
            <input id="pwd" type="password" name="user.password"  class="w3-input" style="width:90%" required="true"/>
        </p>
        <p>
            <button type="submit" onclick="md5()" class="w3-btn w3-section w3-teal w3-ripple">登陆</button>
        </p>
        <span class="w3-right w3-padding w3-hide-small">
            <a href="/Register.jsp">没有账户？</a>
        </span>
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

