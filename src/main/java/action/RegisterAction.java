package action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;
import utils.UserForm;

import java.util.Map;


public class RegisterAction extends ActionSupport {

    private static final long serialVersionUID = 1L;


    private UserForm user;

    @Autowired
    private UserService userService;

    public UserForm getUser() {
        return user;
    }

    public void setUser(UserForm user) {
        this.user = user;
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
}