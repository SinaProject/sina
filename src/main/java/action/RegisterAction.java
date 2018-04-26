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


    /**
     * 定义一个字符串返回结果
     * 以告知前端重复用户名校验结果
     */
    private String result;

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
            this.result = "yes";

        }else {
           this.result="no";
        }

        return SUCCESS;
    }
}