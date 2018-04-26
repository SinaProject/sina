package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @anthor tanshangou
 * @time 2018/4/23
 * @description
 */
@Entity
public class Collect {
    private int collectId;
    private Timestamp collectTime;
    private Integer userId;
    private Integer msgId;

    @Id
    @Column(name = "collectID", nullable = false)
    public int getCollectId() {
        return collectId;
    }

    public void setCollectId(int collectId) {
        this.collectId = collectId;
    }

    @Basic
    @Column(name = "collectTime", nullable = true)
    public Timestamp getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Timestamp collectTime) {
        this.collectTime = collectTime;
    }

    @Basic
    @Column(name = "userID", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "msgID", nullable = true)
    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collect collect = (Collect) o;

        if (collectId != collect.collectId) return false;
        if (collectTime != null ? !collectTime.equals(collect.collectTime) : collect.collectTime != null) return false;
        if (userId != null ? !userId.equals(collect.userId) : collect.userId != null) return false;
        if (msgId != null ? !msgId.equals(collect.msgId) : collect.msgId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = collectId;
        result = 31 * result + (collectTime != null ? collectTime.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (msgId != null ? msgId.hashCode() : 0);
        return result;
    }
}
