package dao;

import entity.Msg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @anthor tanshangou
 * @time 2018/3/30
 * @description
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MsgDaoTest {

    @Autowired
    MsgDao msgDao;

    @Test
    public void addTweet() {
        Msg msg=new Msg();
        msg.setMsgContent("hi");
        msg.setUserId(1);

        msgDao.addTweet(msg);
    }

    @Test
    public void getTweet() {
    }

    @Test
    public void getAllTweetsForUser() {
    }

    @Test
    public void deleteTweet() {

        msgDao.deleteTweet(2);

    }
    //TODO
}