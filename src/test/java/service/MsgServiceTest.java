package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import utils.MsgForm;

import static org.junit.Assert.*;

/**
 * @anthor tanshangou
 * @time 2018/4/17
 * @description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MsgServiceTest {

    @Autowired
    MsgService msgService;

    @Test
    public void addTweet() {

        MsgForm msgForm = new MsgForm();
        msgForm.setMsgContent("hi");
        msgForm.setUserId(1);
        msgForm.setMsgIsForward("N");
        msgService.addTweet(msgForm);

    }
}