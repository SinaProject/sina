package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import service.FansService;
import service.UserService;


import com.opensymphony.xwork2.ActionSupport;

import entity.Fans;
import entity.User;
import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;

public class FollowAction extends ActionSupport implements SessionAware {

    @Autowired
    FansService fansService;

    @Autowired
    UserService userService;


    private Map session;
    private int followId;
    public int getFollowId() {
        return followId;
    }

    public void setFollowId(int followId) {
        this.followId = followId;
    }

    private int userId;

    public List<Fans> getFansList() {
        return fansList;
    }

    public void setFansList(List<Fans> fansList) {
        this.fansList = fansList;
    }

    private List<Fans> fansList;
    private List<User> userList;


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setSession(Map session) {
        this.session=session;

    }

    public String findFollow(){

        userId=(Integer)session.get("userId");
        System.out.println(userId);

        this.fansList=fansService.getAllFollow(userId);

        if(fansList!=null){

            this.userList=new ArrayList();

            for(int i=0;i<fansList.size();i++){
                this.userList.add(userService.getUserById(fansList.get(i).getFansId()));
            }

            if(userList!=null){
                return SUCCESS;
            }
        }
        return ERROR;
    }

    /**
     * ��Ӧ��ӹ�ע�ķ���
     * @return
     */
    public String addFollow() throws Exception{
        if(fansService.addFans(followId,userId)!=null) {
            return SUCCESS;
        }
        return ERROR;
    }

    /**
     * ��Ӧȡ���ע�ķ���
     * @return
     */
    public String deleteFollow() throws Exception{
        userId=(Integer)session.get("userId");
        System.out.println(userId);

        fansService.deleteFollow(followId, userId);


        return "success";
    }


}
