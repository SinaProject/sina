package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.Comment;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import service.CommentService;
import utils.CommentForm;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @anthor tanshangou
 * @time 2018/4/19
 * @description
 */
public class CommentAction extends ActionSupport implements SessionAware {

    @Autowired
    CommentService commentService;

    private CommentForm commentForm;
    private List<Comment> commentList;

    /**
     * 历史遗留的msgId，没时间更改了，如有需要的接着这个来用
     *
     */
    private int msgId;

    private Map session;

    public void setSession(Map session) {
        this.session=session;
    }

    public CommentForm getCommentForm() {
        return commentForm;
    }

    public void setCommentForm(CommentForm commentForm) {
        this.commentForm = commentForm;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }


    /**
     * 执行添加评论
     * @return
     * @throws Exception
     */
    public String execute() throws Exception {
        if(commentService.addComment(commentForm)!=null){
            return SUCCESS;
        }
       return ERROR;
    }


    /**
     * 返回某一条微博的所有评论到前端，以json为数据格式
     * 解析方法具体看前端页面
     * @return
     * @throws Exception
     */

    public String findAllCommments() throws Exception {


        commentList=commentService.getAllComments(msgId);

        return SUCCESS;
    }


}
