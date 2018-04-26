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
    <form id="register-form" action="register.action" class="w3-container w3-card-4">
        <p>
            <label>用户名</label>
            <input type="text" id="userName" name="user.username"  class="w3-input" style="width:90%" required="true"/>
            <span id="name"></span>
        </p>
        <p>
            <label>密码</label>
            <input id="pwd" type="password" name="user.password"  class="w3-input" style="width:90%" required="true"/>
        </p>
        <p>
            <button type="submit" onclick="md5()" class="w3-btn w3-section w3-teal w3-ripple">注册</button>
        </p>
    </form>

</div>
<script>
    function md5() {
        var hash=hex_md5(document.getElementById("pwd").value);
        document.getElementById("pwd").value=hash;
    }

    $(document).ready( function() {

        //使用 Ajax 的方式 判断登录
        $("#userName").blur( function() {

            var url = '/json/register-validation.action';

            //获取表单值，并以json的数据形式保存到params中
            var params = {
                "user.username":$("#userName").val(),
            }
            //使用$.post方式
            $.post(

                url,//服务器要接受的url

                params,//传递的参数

                function callback(data){ //服务器返回后执行的函数参数 data保存的就是服务器发送到客户端的数据

                    var result = data;    //包数据解析为json格式
                    if(result=="yes"){
                        $('#name').html("用户已存在!");}
                    else if(result=="no"){
                        $('#name').html("可以注册!");
                    }
                },
                'json'  //数据传递的类型  json
            );
        });
    });
</script>
</body>
</html>
