package dao;

import entity.Comment;

import java.util.List;

/**
 * @anthor tanshangou
 * @time 2018/4/10
 * @description
 */
public interface CommentDao {

    public Object addComment(Comment comment);

    public void deleteComment(int commentId);

    public List getAllCommentByTweet(int msgId);
}
