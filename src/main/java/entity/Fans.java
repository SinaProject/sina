package entity;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

/**
 * Fans entity. @author MyEclipse Persistence Tools
 */
@Entity
@DynamicUpdate
public class Fans{

	// Fields

	private int focusId;
	private int fansId;
	private Timestamp focusTime;
	private int userId;


	@Id
    @GeneratedValue
    @Column(name = "focusID", nullable = false)
	public Integer getFocusId() {
		return this.focusId;
	}

	public void setFocusId(Integer focusId) {
		this.focusId = focusId;
	}

	@Basic
    @Column(name = "fansID", nullable = false)
	public Integer getFansId() {
		return this.fansId;
	}

	public void setFansId(Integer fansId) {
		this.fansId = fansId;
	}

	@Basic
    @Column(name = "focusTime", nullable = false)
	public Timestamp getFocusTime() {
		return this.focusTime;
	}

	public void setFocusTime(Timestamp focusTime) {
		this.focusTime = focusTime;
	}

	@Basic
    @Column(name = "userID", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Fans fans=(Fans) o;

	        if (focusId != fans.focusId) return false;
	        if (focusTime!= null ? !fans.equals(fans.focusTime) : fans.focusTime != null) return false;
	        if (userId != fans.userId) return false;
	        if (fansId != fans.fansId) return false;

	        return true;
	  }
	 
	
}