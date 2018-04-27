<%--
  Created by IntelliJ IDEA.
  User: niccoleynh
  Date: 2018/4/23
  Time: 下午8:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personal Manage</title>
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
<body class="w3-theme-l5">

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
    <li style="width:33%"><a href="/Profile.jsp">我的主页</a></li>
    <li style="width:33%"><a href="#">我的相册</a></li>
    <li style="width:33%"><a href="/Setup.jsp">设置</a></li>
</ul>

<div class="w3-container w3-content" style="margin-left:auto;margin-right:auto; text-align:center;width:62%;margin-top:10px">
    <!-- The Grid -->
    <div class="w3-row">
        <!-- Left Column -->
        <div class="w3-col m3">
            <ul class="w3-navbar w3-border w3-light-grey w3-center" style="margin-left:auto;margin-right:auto; text-align:center">
                <li style="width:33.3%"><a href="/Follow.jsp">关注</a></li>
                <li style="width:33.3%"><a href="/Follow.jsp">粉丝</a></li>
                <li style="width:33.3%"><a href="#">微博</a></li>
            </ul>

            <br>

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
            <br>

            <!-- Interests -->
            <div class="w3-card-2 w3-round w3-white w3-hide-small">
                <div class="w3-container">
                    <p>Interests</p>
                    <p>
                        <span class="w3-tag w3-small w3-theme-d5">News</span>
                        <span class="w3-tag w3-small w3-theme-d4">W3Schools</span>
                        <span class="w3-tag w3-small w3-theme-d3">Labels</span>
                        <span class="w3-tag w3-small w3-theme-d2">Games</span>
                        <span class="w3-tag w3-small w3-theme-d1">Friends</span>
                        <span class="w3-tag w3-small w3-theme">Games</span>
                        <span class="w3-tag w3-small w3-theme-l1">Friends</span>
                        <span class="w3-tag w3-small w3-theme-l2">Food</span>
                        <span class="w3-tag w3-small w3-theme-l3">Design</span>
                        <span class="w3-tag w3-small w3-theme-l4">Art</span>
                        <span class="w3-tag w3-small w3-theme-l5">Photos</span>
                    </p>
                </div>
            </div>
            <br>

            <!-- Alert Box -->
            <div class="w3-container w3-round w3-theme-l4 w3-border w3-theme-border w3-margin-bottom w3-hide-small">
                <span onclick="this.parentElement.style.display='none'" class="w3-hover-text-grey w3-closebtn">×</span>
                <p><strong>Hey!</strong></p>
                <p>People are looking at your profile. Find out who.</p>
            </div>

            <!-- End Left Column -->
        </div>

        <!-- Middle Column -->
        <div id="middle-column" class="w3-col m9">

            <!--发表微博-->
            <div class="w3-row-padding">
                <div class="w3-col m12">
                    <div class="w3-card-2 w3-round w3-white">
                        <div class="w3-container w3-padding">
                            <h6 class="w3-opacity">今天有啥新感想呢？</h6>
                            <form action="tweet2.action">
                                <p>
                                    <input type="text" name="msg.msgContent" placeholder="今日状态：感到忧伤" class="w3-border w3-input"/>
                                </p>
                                <input type="hidden" name="msg.msgIsForward" value="N"/>
                                <input type="hidden" name="msg.userId" value="<%=session.getAttribute("userId")%>"/>
                                <button type="submit" class="w3-btn w3-theme"><i class="fa fa-pencil"></i>发表</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


            <!--转发框-->
            <div id="id01" class="w3-modal">
                <span onclick="document.getElementById('id01').style.display='none'"
                      class="w3-closebtn w3-hover-red w3-container w3-padding-16 w3-display-topright w3-xxlarge">×</span>
                <div class="w3-modal-content w3-card-8 w3-animate-zoom" style="max-width:400px">

                    <div class="w3-container">
                        <div class="w3-section">
                            <label id="forward-content"><b>请输入转发内容</b></label>
                            <form id="forward-form" action="tweet.action">
                                <input id="userid" type="hidden" name="msg.userId" value="<%=session.getAttribute("userId")%>"/>
                                <input id="forwardid" type="hidden" name="msg.forwardId"/>
                                <input type="hidden" name="msg.msgIsForward" value="Y">
                                <input class="w3-input w3-border w3-hover-border-black w3-margin-bottom" type="text" name="msg.msgContent">
                                <button id="forward-test" type="submit" class="w3-btn w3-btn-block w3-green w3-section">转发</button>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
            <!--评论框-->
            <div id="id02" class="w3-modal">
                <span onclick="document.getElementById('id02').style.display='none'"
                      class="w3-closebtn w3-hover-red w3-container w3-padding-16 w3-display-topright w3-xxlarge">×</span>
                <div class="w3-modal-content w3-card-8 w3-animate-zoom" style="max-width:400px">

                    <div class="w3-container">
                        <div class="w3-section">
                            <label id="comment-content"><b>请输入评论内容</b></label>
                            <form id="comment-form" action="comment.action">
                                <input id="_userid" type="hidden" name="commentForm.userId" value="<%=session.getAttribute("userId")%>"/>
                                <input id="msgid" type="hidden" name="commentForm.msgId"/>
                                <input class="w3-input w3-border w3-hover-border-black w3-margin-bottom" type="text" name="comment.commentContent">
                                <button id="comment" type="submit" class="w3-btn w3-btn-block w3-green w3-section">评论</button>
                            </form>
                        </div>
                        <div id="comment-list" style="padding: 5px">

                        </div>
                    </div>
                </div>
            </div>
            <!-- End Middle Column -->
        </div>



        <!-- End Grid -->
    </div>

    <!-- End Page Container -->
</div>
<br>
</body>

<script>
    //获取微博内容
    $(document).ready(function () {
        var url = "/json/userTweets.action";
        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                $.each(data, function (i, list) {
                    //以下求时间差（也可以直接显示为发布时间）
                    var fromCurrentTime = new Date().getTime()-new Date(list.msgDate).getTime();
                    var days=Math.floor(fromCurrentTime/(24*3600*1000));
                    //计算出小时数
                    var leave1=fromCurrentTime%(24*3600*1000);    //计算天数后剩余的毫秒数
                    var hours=Math.floor(leave1/(3600*1000));
                    //计算相差分钟数
                    var leave2=leave1%(3600*1000);        //计算小时数后剩余的毫秒数
                    var minutes=Math.floor(leave2/(60*1000));
                    var time = days + "天"+hours+"时"+minutes+"分";
                    var card = $("<div id=\"msg-"+list.msgId+"\" class=\"w3-container w3-card-2 w3-white w3-round w3-margin\"><br>\n" +
                            "                <!--头像+名字+发表时间-->\n" +
                            "                <img src=\"http://cdn.w3schools.wang/img_avatar2.png\" alt=\"Avatar\" class=\"w3-left w3-circle w3-margin-right\" style=\"width:60px\">\n" +
                            "                <span class=\"w3-right w3-opacity\">"+time+"前"+"</span>\n" +
                            "                <h4>" + list.userName + "</h4><br>\n" +
                            "                <hr class=\"w3-clear\">\n" +
                            "\n" +
                            "                <!--微博内容-->\n" +
                            "                <p>" + list.msgContent + "</p>\n" +
                            "                <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n" +
                            "                    <div class=\"w3-half\">\n" +
                            "                        <img src=\"http://cdn.w3schools.wang/img_lights.jpg\" style=\"width:100%\" alt=\"Northern Lights\" class=\"w3-margin-bottom\">\n" +
                            "                    </div>\n" +
                            "                    <div class=\"w3-half\">\n" +
                            "                        <img src=\"http://cdn.w3schools.wang/img_nature.jpg\" style=\"width:100%\" alt=\"Nature\" class=\"w3-margin-bottom\">\n" +
                            "                    </div>\n" +
                            "                </div>\n"+
                            "               <div><button id=\"to-delete-"+list.msgId+"\" msgId=\""+list.msgId+"\" type=\"button\" class=\"w3-btn w3-theme-d1 w3-margin-bottom\">" +
                            "               删除</button></div>\n");
                    $("#middle-column").append(card);
                })
            }
        })
    })
    $("div#middle-column").on("click","button[id^='to-delete-']",function(){
        var msgId=$(this).attr("msgId");
        var url="/json/deleteTweet.action";
        $.ajax({
            url:url,
            data:{"msg.msgId":msgId},
            type:"post",
            dataType:"json",
            success:function(){
                alert("成功删除")
            }
        })
    })
</script>
</html>