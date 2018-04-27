package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by niccoleynh on 2018/4/27.
 */
@Entity
public class Fans {
    private int focusId;
    private int fansId;
    private Timestamp focusTime;
    private int userId;

    @Id
    @Column(name = "focusID")
    public int getFocusId() {
        return focusId;
    }

    public void setFocusId(int focusId) {
        this.focusId = focusId;
    }

    @Basic
    @Column(name = "fansID")
    public int getFansId() {
        return fansId;
    }

    public void setFansId(int fansId) {
        this.fansId = fansId;
    }

    @Basic
    @Column(name = "focusTime")
    public Timestamp getFocusTime() {
        return focusTime;
    }

    public void setFocusTime(Timestamp focusTime) {
        this.focusTime = focusTime;
    }

    @Basic
    @Column(name = "userID")
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

        Fans fans = (Fans) o;

        if (focusId != fans.focusId) return false;
        if (fansId != fans.fansId) return false;
        if (userId != fans.userId) return false;
        if (focusTime != null ? !focusTime.equals(fans.focusTime) : fans.focusTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = focusId;
        result = 31 * result + fansId;
        result = 31 * result + (focusTime != null ? focusTime.hashCode() : 0);
        result = 31 * result + userId;
        return result;
    }
}
