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


    /**
     * 收藏时从前端传回msgId以及userId进行添加收藏
     * 具体方法看Dao层实现
     */

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

    /**
     * 执行添加
     * @return
     * @throws Exception
     */

    @Override
    public String execute() throws Exception {



        if(collectService.addCollect(userId,msgId)!=null){
            return SUCCESS;
        }
        return ERROR;
    }

    /**
     * 查找某个用户的所有收藏
     * 收藏实体类数据库设计时不包含内容，只包括引用的msgId
     * 因此还需更改返回逻辑使前端方便显示收藏的具体内容
     * @return
     */

    public String findAllCollects(){

        userId=(Integer) session.get("userId");

        collectList=collectService.getAllCollectsByUser(userId);

        return SUCCESS;
    }

    /**
     * 撤销收藏，前端暂时还没实现
     * @return
     * @throws Exception
     */

    public String revertCollect() throws Exception {


        collectService.deleteCollect(msgId,userId);

        return SUCCESS;
    }


}
