package dao;

import entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @anthor tanshangou
 * @time 2018/4/10
 * @description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CommentDaoTest {

    @Autowired
    CommentDao commentDao;

    @Test
    public void addComment() {


        Comment commment = new Comment();
        commment.setCommentContent("test-comment-1");
        commment.setUserId(2);
        commment.setMsgId(8);

        commentDao.addComment(commment);
    }

    @Test
    public void deleteComment() {
        commentDao.deleteComment(1);

    }

    @Test
    public void getAllCommentByTweet() {
    }
}