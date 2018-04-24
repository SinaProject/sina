package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Collect;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import service.CollectService;

import java.util.List;
import java.util.Map;

/**
 * @anthor tanshangou
 * @time 2018/4/24
 * @description
 */
public class CollectAction extends ActionSupport implements SessionAware {

    @Autowired
    CollectService collectService;

    private Map session;


    private int msgId;

    private int userId;

    private List<Collect> collectList;

    public void setSession(Map session) {
        this.session = session;
    }

    public List<Collect> getCollectList() {
        return collectList;
    }

    public void setCollectList(List<Collect> collectList) {
        this.collectList = collectList;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public int getUserId() {
        return userId;
    }


    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String execute() throws Exception {



        if(collectService.addCollect(userId,msgId)!=null){
            return SUCCESS;
        }
        return ERROR;
    }

    public String findAllCollects(){

        userId=(Integer) session.get("userId");

        collectList=collectService.getAllCollectsByUser(userId);

        return SUCCESS;
    }

    public String revertCollect() throws Exception {


        collectService.deleteCollect(msgId,userId);

        return SUCCESS;
    }


}
