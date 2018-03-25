<%--
  Created by IntelliJ IDEA.
  User: tanshangou
  Date: 2018/3/23
  Time: 上午10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Register Page</title>
</head>
<body>

<s:form action="register">
    <s:textfield name="user.username" label="用户名"/>
    <s:password name="user.password" label="密码"/>
    <s:submit value="注册"/>
</s:form>

</body>
</html>
