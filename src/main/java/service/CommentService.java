package service;

import entity.Comment;
import utils.CommentForm;

/**
 * @anthor tanshangou
 * @time 2018/4/20
 * @description
 */
public interface CommentService {

    public Object addComment(CommentForm commentForm);

}
