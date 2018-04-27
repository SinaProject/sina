package action;

/**
 * @anthor tanshangou
 * @time 2018/4/27
 * @description
 */
import java.util.Map;

import entity.User;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import service.UserService;

/**
 * Created by niccoleynh on 2018/4/27.
 */
public class UserInfoAction extends ActionSupport implements SessionAware {


    private Map session;
    @Autowired
    private SessionFactory sessionFactory;



    public String getUser() {
        Integer userId= (Integer) session.get("userId");
        user=userService.getByUserId(userId);
        return SUCCESS;
    }

    private User user;

    private UserService userService;


    public void setSession(Map session) {
        this.session=session;
    }


}
