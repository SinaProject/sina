package action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.User;
import net.sf.json.JSONObject;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;
import utils.UserForm;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterAction extends ActionSupport implements SessionAware {

    private static final long serialVersionUID = 1L;


    private UserForm user;


    public String getUserName() {
        return userName;
    }

    private  String userName;

    public void setUserDetail(User userDetail) {

        this.userDetail=userDetail;
    }

    private User userDetail;

    private List<User> users;

    private Map session;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    private Integer userId;



    /**n
     * 定义一个字符串返回结果
     * 以告知前端重复用户名校验结果
     */
    private String result;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private UserService userService;

    public UserForm getUser() {
        return user;
    }

    public void setUser(UserForm user) {
        this.user = user;
    }

    /**
     *
     * @return
     */


    @Override
    public void setSession(Map session) {
        this.session=session;

    }
    public void setUsername() {
        userId=(Integer) session.get("userId");
        this.userName=userService.getByUserId(userId).getUserName();
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String execute() {
        try {

            if(userService.regUser(user)!=null){
                return SUCCESS;
            }
            return ERROR;

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }


    /**
     * 用户名校验函数
     * 仅返回校验结果
     * 由前端对结果再进行页面显示处理（已完成）
     * @return
     */
    public String validation(){


        String name = user.getUsername();

        if(userService.isUsernameExists(user.getUsername())){
            result = "yes";

        }else {
           result="no";
        }

        return SUCCESS;
    }


    //编辑，新增
//    public String edit(){
//
//        users=userService.getAll();
//        if(userName != null) //修改
//        {
//            userDetail=userService.getByUserName(userName);
//
//        }
//        return "EDIT_SUCCESS";
//    }

    public String save(){
        setUsername();
        String userName=getUserName();

        if (userName != null){
            userService.updateUser(userDetail,userName);
        }
        else
        {
            userService.addUser(userDetail);
        }
        return SUCCESS;
    }


}