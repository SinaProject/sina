package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import service.FansService;
import utils.FansForm;

import com.opensymphony.xwork2.ActionSupport;

public class FollowAction extends ActionSupport implements SessionAware {

	@Autowired
	FansService fansService;
	
	private FansForm fansForm; 
	private Map session;
	 
	 
	public void setSession(Map session) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * ��Ӧ��ӹ�ע�ķ���
	 * @return
	 */
	public String addFollow() throws Exception{
		if(fansService.addFans(fansForm)!=null) {
			return SUCCESS;
		}
		return ERROR; 
	}
	
	/**
	 * ��Ӧȡ����ע�ķ���
	 * @return
	 */
	public String adeleteFollow() throws Exception{
		if(fansService.addFans(fansForm)!=null) {
			return SUCCESS;
		}
		return ERROR; 
	}
		

}
