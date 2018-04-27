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

    /**
     * 转发的微博实际上也是属于msg
     * 因此仍然沿用了MsgForm
     * 注意要设定转发的标志
     * 具体看Service层逻辑
     * @return
     * @throws Exception
     */

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
