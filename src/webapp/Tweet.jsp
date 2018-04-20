<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: tanshangou
  Date: 2018/4/17
  Time: 下午11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Tweet</title>

    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>

</head>
<body>

<s:form action="tweet">
    <s:textfield name="msg.msgContent" label="微博内容"/>
    <s:submit value="发表"/>
</s:form>

<s:form action="renderTweet">
    <s:submit value="刷新"/>
    <s:iterator value="msgList" var="tweet">
        <tr>
            <td><s:property value="#tweet.getMsgContent()" />
            </td>
            <td><s:property value="#tweet.getMsgColletNum()" />
            </td>
            <td><s:property value="#tweet.getMsgForward()" />
            </td>
            <td><s:property value="#tweet.getMsgReplyNum()" />
            </td>
            <td><s:property value="#tweet.getMsgDate()" />
            </td>
            <td><s:property value="#tweet.getUserId()" />
            </td>
            <td>
                <a href="Comment.jsp?msgId=<s:property value='#tweet.getMsgId()'/>">评论</a>
            </td>
            <td>
                <a href="Forward.jsp?msgContent=<s:property value='#tweet.getMsgContent()'/>&msgId=<s:property value='#tweet.getMsgId()'/>">转发</a>
            </td>
            <%--<td>--%>
                <%--<s:submit action="" value="点赞"/>--%>
            <%--</td>--%>

        </tr>
    </s:iterator>
</s:form>



</body>
</html>
