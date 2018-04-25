package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import service.MsgService;
import utils.MsgForm;

import java.util.Map;

/**
 * @anthor tanshangou
 * @time 2018/4/17
 * @description
 */
public class ForwardAction extends ActionSupport implements SessionAware {

    private Map session;

    private MsgForm msgForm;

    @Autowired
    MsgService msgService;


    public void setSession(Map session) {

    }

    @Override
    public String execute() throws Exception {

        msgService.addTweet(msgForm);
        return SUCCESS;
    }


    public MsgForm getMsgForm() {
        return msgForm;
    }

    public void setMsgForm(MsgForm msgForm) {
        this.msgForm = msgForm;
    }
}
