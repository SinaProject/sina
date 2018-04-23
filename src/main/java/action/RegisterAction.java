package action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;
import utils.UserForm;

import java.util.HashMap;
import java.util.Map;


public class RegisterAction extends ActionSupport {

    private static final long serialVersionUID = 1L;


    private UserForm user;

    private String result;

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

    public String validation(){


        String name = user.getUsername();

        if(userService.isUsernameExists(user.getUsername())){
            this.result = "yes";

        }else {
           this.result="no";
        }

        return SUCCESS;
    }
}