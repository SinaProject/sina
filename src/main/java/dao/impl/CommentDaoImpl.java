package dao.impl;

import dao.CommentDao;
import entity.Comment;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @anthor tanshangou
 * @time 2018/4/10
 * @description
 */

@Repository
@Transactional
public class CommentDaoImpl implements CommentDao {
    @Autowired
    SessionFactory sessionFactory;

    /**
    
     *@描述 
    
     *@参数  
    
     *@返回值  
    
     */
    public Object addComment(Comment comment) {
        return sessionFactory.getCurrentSession().save(comment);
    }
    
    /**
    
     *@描述 
    
     *@参数  
    
     *@返回值  
    
     */
    public void deleteComment(int commentId) {
        Comment comment = (Comment) sessionFactory.getCurrentSession().get(Comment.class,commentId);
        if (comment != null){
            sessionFactory.getCurrentSession().delete(comment);
        }else {
            //TODO
        }
    }

    /**
    
     *@描述 
    
     *@参数  
    
     *@返回值  
    
     */
    public List getAllCommentByTweet(int msgId) {

        String hql="FROM comment where msgId=?";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }
}
