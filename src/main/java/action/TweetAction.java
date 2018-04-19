package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Msg;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import service.MsgService;
import utils.MsgForm;

import java.util.List;
import java.util.Map;

/**
 * @anthor tanshangou
 * @time 2018/4/17
 * @description
 */
public class TweetAction extends ActionSupport implements SessionAware {

    private MsgForm msg;
    private List<Msg> msgList;

    @Autowired
    MsgService msgService;

    private Map session;

    public void setSession(Map session) {
        this.session=session;
    }

    public MsgForm getMsg() {
        return msg;
    }

    public void setMsg(MsgForm msg) {
        this.msg = msg;
    }

    public List<Msg> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<Msg> msgList) {
        this.msgList=msgList;
    }

    public String execute() {
        try {

            msgService.addTweet(msg,(Integer) session.get("userId"));
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    public String findAllGoods(){
        this.msgList=msgService.getAllTweet();

        return "success";
    }


}
