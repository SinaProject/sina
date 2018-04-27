package action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import entity.Msg;
import entity.User;
import com.opensymphony.xwork2.ActionSupport;
import service.SystemMessageService;

@Component("systemMessageAction")
@Scope("prototype")
public class SystemMessageAction extends ActionSupport {
	@Autowired
	private SystemMessageService systemMessageService;
	private List<Msg> messages;
	private Integer adminUserID;

	public List<Msg> getMessages() {
		return messages;
	}

	/**
	 * get messages from database
	 *
	 * @return
	 */
	public String queryMessage() {
		messages = systemMessageService.queryMessage(adminUserID,null);
		return SUCCESS;
	}
	/**
	 * delete message
	 * @return
	 */
	public String delete() {
		try {
			int msgID  = 0;
			systemMessageService.deleteMessage(msgID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return queryMessage();
	}
	/**
	 * get request form param
	 * @param key param key
	 * @return param
	 */
	protected String getParam(String key) {
		return ServletActionContext.getRequest().getParameter(key);
	}
}
