package utils;

import java.sql.Timestamp;

/**
 * @anthor tanshangou
 * @time 2018/4/17
 * @description
 */
public class MsgForm {


    private String msgContent;
    private Integer msgCollectNum;
    private Integer msgForward;
    private Integer msgReplyNum;
    private Integer msgZanNum;
    private int userId;


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

    public Integer getMsgCollectNum() {
        return msgCollectNum;
    }

    public void setMsgCollectNum(Integer msgCollectNum) {
        this.msgCollectNum = msgCollectNum;
    }

    public Integer getMsgForward() {
        return msgForward;
    }

    public void setMsgForward(Integer msgForward) {
        this.msgForward = msgForward;
    }

    public Integer getMsgReplyNum() {
        return msgReplyNum;
    }

    public void setMsgReplyNum(Integer msgReplyNum) {
        this.msgReplyNum = msgReplyNum;
    }

    public Integer getMsgZanNum() {
        return msgZanNum;
    }

    public void setMsgZanNum(Integer msgZanNum) {
        this.msgZanNum = msgZanNum;
    }
}
