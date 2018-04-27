package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import entity.User;
import service.AdminUserService;
import service.UserService;
import utils.UserForm;

public class AdminLoginAction extends ActionSupport implements SessionAware {
    private UserForm user;
    private Map session;

    @Autowired
    private AdminUserService adminUserService;
    @Override
    public void setSession(Map<String, Object> arg0) {
        session = arg0;

    }
    @Override
    public String execute() {
        try {
            User backUser=adminUserService.login(user);

            if(backUser!=null){
                session.put("userId",backUser.getUserId());
                session.put("userRole",backUser.getUserRole());
            }else return ERROR;


            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    public void setUser(UserForm user) {
        this.user = user;
    }
}
