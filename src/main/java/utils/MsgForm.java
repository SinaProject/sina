package utils;

import java.sql.Timestamp;

/**
 * @anthor tanshangou
 * @time 2018/4/17
 * @description
 */
public class MsgForm {


    private String msgContent;

    private String msgIsForward;

    private int forwardId;

    private int userId;

    private int msgId;


    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getForwardId() {
        return forwardId;
    }

    public void setForwardId(int forwardId) {
        this.forwardId = forwardId;
    }

    public String getMsgIsForward() {
        return msgIsForward;
    }

    public void setMsgIsForward(String msgIsForward) {
        this.msgIsForward = msgIsForward;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }
}
