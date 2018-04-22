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

    public String execute() throws Exception {
        if(commentService.addComment(commentForm)!=null){
            return SUCCESS;
        }
       return ERROR;
    }



    public String findAllCommments() throws Exception {


        commentList=commentService.getAllComments(msgId);

        return SUCCESS;
    }


}
