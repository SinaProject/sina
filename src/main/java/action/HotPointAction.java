package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.service.HotPointService;

@Component("hotPointAction")
@Scope("prototype")
public class HotPointAction extends ActionSupport implements SessionAware{
	@Autowired
	private HotPointService hotPointService;
	private Map session;
	@Override
	public void setSession(Map session) {
		this.session = session;
	}
	public String getHotPoint(){
		return hotPointService.searchHotPoint();
	}
}
