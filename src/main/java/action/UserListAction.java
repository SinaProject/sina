package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import service.UserService;

public class UserListAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 3496418176861653394L;
	@Autowired
    private UserService userService;
	
	private Map session;

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
	}

}
