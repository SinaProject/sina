package service.impl;

import dao.CommentDao;
import entity.Comment;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CommentService;
import utils.CommentForm;

/**
 * @anthor tanshangou
 * @time 2018/4/20
 * @description
 */

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentDao commentDao;

    public Object addComment(CommentForm commentForm) {
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentForm,comment);
        comment.setUserId(commentForm.getUserId());
        return commentDao.addComment(comment);
    }
}
