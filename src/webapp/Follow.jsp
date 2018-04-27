<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>W3.CSS</title>

    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>

</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://cdn.w3schools.wang/w3.css">
<link rel="stylesheet" href="http://res.w3schools.wang/cate/w3css/w3-theme-blue-grey.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans">
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
<style>
    html, body, h1, h2, h3, h4, h5 {
        font-family: "Open Sans", sans-serif
    }
</style>
<style>
    .usercard{ th:700px; height:700px; border:1px solid #F00; text-align:center; line-height:700px;}
</style>

<body lass="w3-theme-l5">

<!-- Navbar -->
<!-- Navbar -->
<div class="w3-top">
    <ul class="w3-navbar w3-theme-d2 w3-left-align w3-large">
        <li class="w3-hide-medium w3-hide-large w3-opennav w3-right">
            <a class="w3-padding-large w3-hover-white w3-large w3-theme-d2" href="#"
               onclick="openNav()"><i class="fa fa-bars"></i></a>
        </li>
        <li><a href="/Profile.jsp" class="w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Logo</a></li>
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
        <li class="w3-hide-small w3-right"><a href="/PersonalManage.jsp" class="w3-padding-large w3-hover-white" title="My Account"><img
                src="http://cdn.w3schools.wang/img_avatar2.png" class="w3-circle" height="25" width="25"
                alt="Avatar"></a></li>
    </ul>
</div>

<!-- Navbar on small screens -->
<div id="navDemo" class="w3-hide w3-hide-large w3-hide-medium w3-top" style="margin-top:51px">
    <ul class="w3-navbar w3-left-align w3-large w3-theme">
        <li><a class="w3-padding-large" href="#">Link 1</a></li>
        <li><a class="w3-padding-large" href="#">Link 2</a></li>
        <li><a class="w3-padding-large" href="#">Link 3</a></li>
        <li><a class="w3-padding-large" href="#">My Profile</a></li>
    </ul>
</div>

<!-- Page Container -->
<s:form action="follow_deleteFollow" namespace="/" theme="simple">
    <div class="w3-container w3-content" style="max-width:1000px;margin-top:80px">
        <!-- PCD-header -->
        <div class="w3-card-2 w3-round w3-white" style="width:1000px;margin:0px auto">
            <div class="w3-container">
                <p class="w3-center"><img src="http://cdn.w3schools.wang/img_avatar3.png" class="w3-circle"
                                          height="106" width="106" alt="Avatar"></p>
                <hr>
                <p style="text-align:center">${user.userName}</p>
                <p style="text-align:center">Introduction</p>
                <hr>
                <div style="width:60%;margin:0px auto"">
                <table >
                    <tbody>
                    <tr>
                        <td style="text-align:center"><a href="/Profile.jsp">我的主页</a></td>
                        <td style="text-align:center"><a href="/Profile.jsp">个人中心</a></td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <br>
        </div>
    </div>
    <!-- end of PCD-header -->
    <br>
    <!-- The Grid -->
    <div class="w3-row">
        <!-- Left Column -->
        <div class="w3-col m3" >
            <div class="w3-container">
                <!-- Accordion -->
                <div class="w3-card-2 w3-round">
                    <div class="w3-accordion w3-white">
                        <button onclick="myFunction('Demo1')" class="w3-btn-block w3-theme-l1 w3-left-align"><i
                                class="fa fa-circle-o-notch w3-margin-right"></i> My Groups
                        </button>
                        <div id="Demo1" class="w3-accordion-content w3-container">
                            <p>Some text..</p>
                        </div>
                        <button onclick="myFunction('Demo2')" class="w3-btn-block w3-theme-l1 w3-left-align"><i
                                class="fa fa-calendar-check-o w3-margin-right"></i> My Events
                        </button>
                        <div id="Demo2" class="w3-accordion-content w3-container">
                            <p>Some other text..</p>
                        </div>
                        <button onclick="myFunction('Demo3')" class="w3-btn-block w3-theme-l1 w3-left-align"><i
                                class="fa fa-users w3-margin-right"></i> My Photos
                        </button>
                        <div id="Demo3" class="w3-accordion-content w3-container">
                            <div class="w3-row-padding">
                                <br>
                                <div class="w3-half">
                                    <img src="http://cdn.w3schools.wang/img_lights.jpg" style="width:100%"
                                         class="w3-margin-bottom">
                                </div>
                                <div class="w3-half">
                                    <img src="http://cdn.w3schools.wang/img_nature.jpg" style="width:100%"
                                         class="w3-margin-bottom">
                                </div>
                                <div class="w3-half">
                                    <img src="http://cdn.w3schools.wang/img_mountains.jpg" style="width:100%"
                                         class="w3-margin-bottom">
                                </div>
                                <div class="w3-half">
                                    <img src="http://cdn.w3schools.wang/img_forest.jpg" style="width:100%"
                                         class="w3-margin-bottom">
                                </div>
                                <div class="w3-half">
                                    <img src="http://cdn.w3schools.wang/img_nature.jpg" style="width:100%"
                                         class="w3-margin-bottom">
                                </div>
                                <div class="w3-half">
                                    <img src="http://cdn.w3schools.wang/img_fjords.jpg" style="width:100%"
                                         class="w3-margin-bottom">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- end of Accordion -->
            </div>


        </div>
        <!-- end of left Column -->

        <!-- Right Column -->
        <div id="right-column" class="w3-col m9">
            <div class="w3-row-paddingg">
                <div class="w3-card-2 w3-round w3-white">
                    <p style="margin-left:10px;padding-top:15px">全部关注</p>
                    <!-- followlist -->
                    <div id="list-column">

                        <!-- js -->


                    </div>
                    <!-- end of followlist -->
                </div>
                <!-- card -->
            </div>
            <!-- row-padding-->
        </div>
        <!-- end of Right Column -->
    </div>
    <!-- end of grid -->

    </div>
</s:form>
<!-- end of Page Container -->

<script type="text/javascript">
    /**
     *获取关注用户列表
     */

    $(document).ready(function(){

        var url= "/json/findFollow.action";
        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                $.each(data, function (i, item) {
                    var card=$("<div id=\"usercard-"+item.userId+"\"  class=\"w3-card-2 w3-round w3-white\" style=\"width:95%; height:100px;padding:15px;margin:0px auto\" >"+
                            "			<table style=\"width:90%; height:70px\">"+
                            "				<tr>"+
                            "					<td><div class=\"w3-center\" ><img src=\"http://cdn.w3schools.wang/img_avatar3.png\" class=\"w3-circle\" height=\"50\" width=\"50\" alt=\"Avatar\"></div></td>"+
                            "					<td><div style=\"width:1px; height:80px; border-left: 1px solid gray\"></div></td>"+
                            "					<td align=\"center\" valign=\"middle\"><span style=\"font-size:16px;font-weight:bold\">"+item.userName+"</span></td>"+
                            "                	<td align=\"center\" valign=\"middle\"><span style=\"font-size:14px;font-color:gray\">"+item.userInfo+"</span></td>"+
                            "                	<td align=\"center\" valign=\"middle\"><button id=\"cancel-"+item.userId+"\" followId=\""+item.userId+"\"  type=\"button\"  class=\"w3-btn w3-teal\" style=\"font-size:12px;margin-top:10px\">取消关注</button> </td>"+
                            "				</tr>"+
                            "			</table>"+
                            "			</div>");
                    $("#list-column").append(card);
                })
            }

        })
    })


    $("div#list-column").on("click","button[id^='cancel-']",function(){
        var followId=$(this).attr('followId');
        var url="/json/deleteFollow.action";
        alert(followId);
        $.ajax({
            url:url,
            data:{"followId":followId},
            type:"post",
            dataType:"json",
            success:function(result){
                alert("删除成功");

            }
        })

    });
</script>

</body>


</html>
