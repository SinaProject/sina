package action;

import java.util.List;
import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import entity.User;
import com.opensymphony.xwork2.ActionSupport;

import service.AdminUserService;
import service.UserService;
import utils.UserForm;

@Component("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Autowired
    private AdminUserService adminUserService;
    private UserForm userForm;
    private String searchText;
    private List<User> users;

    public UserForm getUserForm() {
        return userForm;
    }
    public void setUser(UserForm userForm) {
        this.userForm = userForm;
    }
    public AdminUserService getUserService() {
        return adminUserService;
    }
    @Resource
    public void setUserService(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }


    public String queryUser(){
        searchText = getParam("search");
        users = adminUserService.queryUsers(searchText);
        return SUCCESS;
    }

    public String editUser(){
        try {
            Integer param = Integer.parseInt(getParam("param"));
            if(param == 0){
                UserForm checkedUser;
                Integer id = Integer.parseInt(getParam("id"));
                checkedUser = adminUserService.getUser(id);
                return "editUser";
            }else if(param == 1){
                adminUserService.modifyUser(userForm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String deleteUser(){
        try {
            Integer param = Integer.parseInt(getParam("id"));
            adminUserService.deleteUser(param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return queryUser() ;
    }
    public String getSearchText() {
        return searchText;
    }
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
    protected String getParam(String key){
        return ServletActionContext.getRequest().getParameter(key);
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
}