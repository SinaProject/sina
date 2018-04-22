package utils;

/**
 * @anthor tanshangou
 * @time 2018/4/20
 * @description
 */
public class CommentForm {

    private int msgId;
    private String commentContent;
    private int userId;

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
