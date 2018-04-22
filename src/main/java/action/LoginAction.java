package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.User;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;
import utils.UserForm;

import java.util.Map;

/**
 * @anthor tanshangou
 * @time 2018/4/19
 * @description
 */
public class LoginAction extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 1L;


    private UserForm user;

    private Map session;

    @Autowired
    private UserService userService;

    public UserForm getUser() {
        return user;
    }

    public void setUser(UserForm user) {
        this.user = user;
    }

    public void setSession(Map session) {
        this.session=session;
    }

    public String execute() {
        try {

            User backUser=userService.login(user);

            if(backUser!=null){
                session.put("userId",backUser.getUserId());
            }else return ERROR;


            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }


}
