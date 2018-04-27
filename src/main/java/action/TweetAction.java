package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.Msg;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import service.MsgService;
import utils.MsgForm;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @anthor tanshangou
 * @time 2018/4/17
 * @description
 */
public class TweetAction extends ActionSupport implements SessionAware{

    private MsgForm msg;
    private List<Msg> msgList;

    @Autowired
    MsgService msgService;

    private Map session;

    private String result;

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
        this.msgList = msgList;
    }


    /**
     * 添加一条微博，具体的处理逻辑看Service层
     * @return
     */
    public String execute() {
        try {

            msgService.addTweet(msg);

            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }


    /**
     * 返回所有微博，json格式
     * （前端未实现分页功能）
     * @return
     * @throws IOException
     */
    public String findAllGoods() throws IOException {

        this.msgList=msgService.getAllTweet();
        return SUCCESS;
    }

    /**
     * 点赞功能，具体逻辑看Service层
     * （未实现统计点赞数目）
     * @return
     */
    public String likeTeet(){


        msgService.likeTeet(msg.getMsgId());


        return SUCCESS;
    }

    public String findAllGoodsForUser(){
        this.msgList=msgService.getAllTweetsForUser((Integer)session.get("userId"));

        return SUCCESS;
    }

    public String deleteTweet(){

        msgService.deleteTweet(msg.getMsgId());
        return SUCCESS;
    }
}
