<%--
  Created by IntelliJ IDEA.
  User: niccoleynh
  Date: 2018/4/23
  Time: 下午11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setup</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>

</head>
<meta name="viewport" content="text-align:left;width=device-text-align:left;width, initial-scale=1">
<meta name="viewport" content="text-align:left;width=device-text-align:left;width, initial-scale=1">
<link rel="stylesheet" href="../default/resources/style/w3_try.css">
<style>
    .city {display:none;}
</style>
<link rel="stylesheet" href="http://cdn.w3schools.wang/w3.css">
<link rel="stylesheet" href="http://res.w3schools.wang/cate/w3css/w3-theme-blue-grey.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans">
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">

<style>
    html, body, h1, h2, h3, h4, h5 {
        font-family: "Open Sans", sans-serif
    }
</style>
<body class="w3-theme-l5">
<div class="w3-top">
    <ul class="w3-navbar w3-theme-d2 w3-left-align w3-large">
        <li class="w3-hide-medium w3-hide-large w3-opennav w3-right">
            <a class="w3-padding-large w3-hover-white w3-large w3-theme-d2" href="javascript:void(0);"
               onclick="openNav()"><i class="fa fa-bars"></i></a>
        </li>
        <li><a href="#" class="w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Logo</a></li>
        <li class="w3-hide-small w3-dropdown-hover ">
            <a href="#" class="w3-padding-large w3-hover-white" title="Notifications"><i class="fa fa-bell"></i><span
                    class="w3-badge w3-right w3-small w3-green">3</span></a>
            <div class="w3-dropdown-content w3-white w3-card-4">
                <a href="#">@我的</a>
                <a href="#">评论</a>
                <a href="#">赞</a>
                <a href="#">私信</a>
                <a href="#">未关注人私信</a>
                <a href="#">群通知</a>
            </div>
        </li>
        <li class="w3-hide-small w3-right"><a href="#" class="w3-padding-large w3-hover-white" title="My Account"><img
                src="http://cdn.w3schools.wang/img_avatar2.png" class="w3-circle" height="25" width="25"
                alt="Avatar"></a></li>
    </ul>
</div>

<!-- Page Container -->
<%--image header--%>
<div style="margin-left:auto;margin-right:auto;margin-top:70px; text-align:center;width:60%;height:200px;background-image: url('http://img.hb.aicdn.com/95cc92a367b8b42621861552802ba379494b43469c121-REn1fb_fw658')">
    <img src="http://img.hb.aicdn.com/95cc92a367b8b42621861552802ba379494b43469c121-REn1fb_fw658"  class="w3-circle"
         height="100dx" width="100dx" alt="Avatar" style="margin-top: 50px"/>
    <div  style="margin-top: 6px;color: #fff;text-align: center;text-shadow: 0 0 4px rgba(0,0,0,0.5);vertical-align: text-bottom;">Nicole
        <%--<span class="icon_bed"><a><i class="W_icon icon_pf_female"></i></a></span>--%>
    </div>
    <div style="margin-top: 4px;text-align: center;color: #fff;line-height: 18px;text-shadow: 0 0 4px rgba(0,0,0,0.5);">
        " yesterday is history, tomorrow is a mystery, but today is the present. "
    </div>
</div>

<ul class="w3-navbar w3-border w3-light-grey w3-center" style="margin-left:auto;margin-right:auto; text-align:center;width:60%">
    <li style="width:50%"><a href="/Profile.jsp">我的主页</a></li>
    <li style="width:50%"><a href="#">我的相册</a></li>
</ul>

<div class="w3-container w3-content" style="margin-left:auto;margin-right:auto; text-align:center;width:62%;margin-top:10px">
    <!-- Middle Column -->
    <div id="middle-column" class="w3-col ">
        <nav class="w3-sidenav w3-light-grey w3-card-2" style="text-align:left;width:130px;height:400px;position: absolute">
            <div class="w3-container">
                <h5>Menu</h5>
            </div>
            <a href="#" class="tablink" onclick="openCity(event, 'info')">我的信息</a>
            <a href="#" class="tablink" onclick="openCity(event, 'picture')">修改头像</a>
        </nav>

        <div style="margin-left:130px">

            <div id="info" class="w3-container city">
                <form id="setup-form" action="setupAction.action" class="w3-container w3-card-4">

                    <div style="text-align:left;">
                        <label style="text-align:justify;">密码  :</label>
                        <input id="pwd" type="password" name="userDetail.password"   style="text-align:left;width:80%" required="true"/>
                    </div>
                    </br>
                    <div style="text-align:left;">
                        <label style="text-align:justify;">性别  :</label>
                        <input type="text" id="sex" name="userDetail.username"  style="text-align:left;width:80%" required="true"/>
                    </div>
                    </br>
                    <div style="text-align:left;">
                        <label style="text-align:justify;">电话  :</label>
                        <input type="text" id="userPhone" name="userDetail.username"  style="text-align:left;width:80%" required="true"/>
                    </div>
                    </br>
                    <div style="text-align:left;">
                        <label>生日  :</label>
                        <input type="text" id="userBirth" name="userDetail.username"  style="text-align:left;width:80%" required="true"/>
                    </div>
                    </br>
                    <div style="text-align:left;">
                        <label style="text-align:justify;">博客地址:</label>
                        <input type="text" id="userBlogAddress" name="userDetail.username"  style="text-align:left;width:80%" required="true"/>
                    </div>
                    </br>
                    <div style="text-align:left;">
                        <label>个人简介:</label>
                        <input type="text" id="userInfo" name="userDetail.username"  style="text-align:left;width:90%" required="true"/>
                    </div>
                    <div>
                        <button type="submit" onclick="md5()" class="w3-btn w3-section w3-teal w3-ripple">提交修改</button>
                    </div>

                </form>


            </div>
            <div id="id01" class="w3-modal">

            </div>


        </div>



        <script>
            function openCity(evt, cityName) {
                var i, x, tablinks;
                x = document.getElementsByClassName("city");
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                tablinks = document.getElementsByClassName("tablink");
                for (i = 0; i < x.length; i++) {
                    tablinks[i].className = tablinks[i].className.replace(" w3-red", "");
                }
                document.getElementById(cityName).style.display = "block";
                evt.currentTarget.className += " w3-red";
            }
        </script>



        <!-- End Middle Column -->
    </div>


    <!-- End Page Container -->
</div>
<br>

<!-- Footer -->
<%--<div style="position:absolute;bottom:0;text-align:left;width:100%;height:100px;background-color: #ffc0cb;">--%>
<%--<footer class="w3-container w3-theme-d3 w3-padding-16">--%>
<%--<h5>Footer</h5>--%>
<%--</footer>--%>

<%--<footer class="w3-container w3-theme-d5">--%>
<%--<p>Powered by <a href="http://w3schools.wang/" target="_blank">w3.css</a></p>--%>
<%--</footer>--%>

<%--</div>--%>

</body>
</html>
