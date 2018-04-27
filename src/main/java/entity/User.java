package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class User {
    private int userId;
    private String userName;
    private String userPicture;
    private String password;
    private String sex;
    private String userPhone;
    private String userBlogAddress;
    private Date userBirth;
    private String userInfo;
    private String bkImage;
    private String userRole;

    @Id
    @GeneratedValue
    @Column(name = "userID", nullable = false)

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userName", nullable = false, length = 30)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "userPicture", nullable = true, length = 100)
    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "userPhone", nullable = true, length = 40)
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "userBlogAddress", nullable = true, length = 100)
    public String getUserBlogAddress() {
        return userBlogAddress;
    }

    public void setUserBlogAddress(String userBlogAddress) {
        this.userBlogAddress = userBlogAddress;
    }

    @Basic
    @Column(name = "userBirth", nullable = true)
    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    @Basic
    @Column(name = "userInfo", nullable = true, length = 100)
    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    @Basic
    @Column(name = "bkImage", nullable = true, length = 100)
    public String getBkImage() {
        return bkImage;
    }

    public void setBkImage(String bkImage) {
        this.bkImage = bkImage;
    }


    @Basic
    @Column(name = "userRole", nullable = false, length = 16)
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userPicture != null ? !userPicture.equals(user.userPicture) : user.userPicture != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (userPhone != null ? !userPhone.equals(user.userPhone) : user.userPhone != null) return false;
        if (userBlogAddress != null ? !userBlogAddress.equals(user.userBlogAddress) : user.userBlogAddress != null)
            return false;
        if (userBirth != null ? !userBirth.equals(user.userBirth) : user.userBirth != null) return false;
        if (userInfo != null ? !userInfo.equals(user.userInfo) : user.userInfo != null) return false;
        if (bkImage != null ? !bkImage.equals(user.bkImage) : user.bkImage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPicture != null ? userPicture.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (userPhone != null ? userPhone.hashCode() : 0);
        result = 31 * result + (userBlogAddress != null ? userBlogAddress.hashCode() : 0);
        result = 31 * result + (userBirth != null ? userBirth.hashCode() : 0);
        result = 31 * result + (userInfo != null ? userInfo.hashCode() : 0);
        result = 31 * result + (bkImage != null ? bkImage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPicture='" + userPicture + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userBlogAddress='" + userBlogAddress + '\'' +
                ", userBirth=" + userBirth +
                ", userInfo='" + userInfo + '\'' +
                ", bkImage='" + bkImage + '\'' +
                '}';
    }




}
