<%--
  Created by IntelliJ IDEA.
  User: tanshangou
  Date: 2018/4/20
  Time: 上午10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
    <title>Forward</title>
</head>
<body>
<%int msgId=Integer.parseInt(request.getParameter("msgId"));%>
<%String msgContent=request.getParameter("msgContent");%>

<s:form action="tweet">
    <label>"<%=msgContent%>"</label>
    <s:textfield name="msg.msgContent" label="内容"/>
    <input type="hidden" name="msg.msgId" value="<%=msgId%>"/>
    <s:hidden name="msg.msgIsForward" value="Y"/>
    <s:submit value="确认转发"/>
</s:form>

</body>
</html>