<%--
  Created by IntelliJ IDEA.
  User: tanshangou
  Date: 2018/4/20
  Time: 上午12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
    <title>Comment</title>
</head>
<body>
<%int msgId=Integer.parseInt(request.getParameter("msgId"));%>

<s:form action="comment">
    <s:textfield name="commentForm.commentContent" label="内容"/>
    <input type="hidden" name="commentForm.msgId" value="<%=msgId%>"/>
    <s:submit value="发表评论"/>
</s:form>

</body>
</html>
