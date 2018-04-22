package entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@DynamicUpdate
public class Msg {
    private int msgId;
    private String msgContent;
    private Integer msgCollectNum;
    private Integer msgForward;
    private Integer msgReplyNum;
    private Timestamp msgDate;
    private String msgIsForward;
    private Integer msgForwardId;
    private String masgLink;
    private Integer msgZanNum;
    private String userName;
    private int userId;

    @Id
    @GeneratedValue
    @Column(name = "msgID", nullable = false)
    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    @Basic
    @Column(name = "msgContent", nullable = true, length = 400)
    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    @Basic
    @Column(name = "msgCollectNum", nullable = true, updatable = false, insertable = false)
    public Integer getMsgCollectNum() {
        return msgCollectNum;
    }

    public void setMsgCollectNum(Integer msgCollectNum) {
        this.msgCollectNum = msgCollectNum;
    }

    @Basic
    @Column(name = "msgForward", nullable = true)
    public Integer getMsgForward() {
        return msgForward;
    }

    public void setMsgForward(Integer msgForward) {
        this.msgForward = msgForward;
    }

    @Basic
    @Column(name = "msgReplyNum", nullable = true)
    public Integer getMsgReplyNum() {
        return msgReplyNum;
    }

    public void setMsgReplyNum(Integer msgReplyNum) {
        this.msgReplyNum = msgReplyNum;
    }

    @Basic
    @Column(name = "msgDate", nullable = true)
    public Timestamp getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Timestamp msgDate) {
        this.msgDate = msgDate;
    }

    @Basic
    @Column(name = "msgIsForward", nullable = true, length = 1)
    public String getMsgIsForward() {
        return msgIsForward;
    }

    public void setMsgIsForward(String msgIsForward) {
        this.msgIsForward = msgIsForward;
    }

    @Basic
    @Column(name = "msgForwardID", nullable = true)
    public Integer getMsgForwardId() {
        return msgForwardId;
    }

    public void setMsgForwardId(Integer msgForwardId) {
        this.msgForwardId = msgForwardId;
    }

    @Basic
    @Column(name = "masgLink", nullable = true, length = 100)
    public String getMasgLink() {
        return masgLink;
    }

    public void setMasgLink(String masgLink) {
        this.masgLink = masgLink;
    }

    @Basic
    @Column(name = "msgZanNum", nullable = true)
    public Integer getMsgZanNum() {
        return msgZanNum;
    }

    public void setMsgZanNum(Integer msgZanNum) {
        this.msgZanNum = msgZanNum;
    }

    @Basic
    @Column(name = "userName", nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Basic
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Msg msg = (Msg) o;

        if (msgId != msg.msgId) return false;
        if (userId != msg.userId) return false;
        if (msgContent != null ? !msgContent.equals(msg.msgContent) : msg.msgContent != null) return false;
        if (msgCollectNum != null ? !msgCollectNum.equals(msg.msgCollectNum) : msg.msgCollectNum != null) return false;
        if (msgForward != null ? !msgForward.equals(msg.msgForward) : msg.msgForward != null) return false;
        if (msgReplyNum != null ? !msgReplyNum.equals(msg.msgReplyNum) : msg.msgReplyNum != null) return false;
        if (msgDate != null ? !msgDate.equals(msg.msgDate) : msg.msgDate != null) return false;
        if (msgIsForward != null ? !msgIsForward.equals(msg.msgIsForward) : msg.msgIsForward != null) return false;
        if (msgForwardId != null ? !msgForwardId.equals(msg.msgForwardId) : msg.msgForwardId != null) return false;
        if (masgLink != null ? !masgLink.equals(msg.masgLink) : msg.masgLink != null) return false;
        if (msgZanNum != null ? !msgZanNum.equals(msg.msgZanNum) : msg.msgZanNum != null) return false;
        return userName != null ? userName.equals(msg.userName) : msg.userName == null;
    }

    @Override
    public int hashCode() {
        int result = msgId;
        result = 31 * result + (msgContent != null ? msgContent.hashCode() : 0);
        result = 31 * result + (msgCollectNum != null ? msgCollectNum.hashCode() : 0);
        result = 31 * result + (msgForward != null ? msgForward.hashCode() : 0);
        result = 31 * result + (msgReplyNum != null ? msgReplyNum.hashCode() : 0);
        result = 31 * result + (msgDate != null ? msgDate.hashCode() : 0);
        result = 31 * result + (msgIsForward != null ? msgIsForward.hashCode() : 0);
        result = 31 * result + (msgForwardId != null ? msgForwardId.hashCode() : 0);
        result = 31 * result + (masgLink != null ? masgLink.hashCode() : 0);
        result = 31 * result + (msgZanNum != null ? msgZanNum.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + userId;
        return result;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msgId=" + msgId +
                ", msgContent='" + msgContent + '\'' +
                ", msgCollectNum=" + msgCollectNum +
                ", msgForward=" + msgForward +
                ", msgReplyNum=" + msgReplyNum +
                ", msgDate=" + msgDate +
                ", msgIsForward='" + msgIsForward + '\'' +
                ", msgForwardId=" + msgForwardId +
                ", masgLink='" + masgLink + '\'' +
                ", msgZanNum=" + msgZanNum +
                ", userId=" + userName +
                '}';
    }


}
