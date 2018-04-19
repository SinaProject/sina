package service.impl;

import dao.MsgDao;
import dao.UserDao;
import entity.Msg;
import entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.MsgService;
import utils.MsgForm;

import java.util.List;

/**
 * @anthor tanshangou
 * @time 2018/4/10
 * @description
 */

@Service
public class MsgServiceImpl implements MsgService {


    @Autowired
    private MsgDao msgDao;

    @Autowired
    UserDao userDao;



    @Transactional
    public void addTweet(MsgForm msgForm,int userId) {

        Msg msg = new Msg();
        BeanUtils.copyProperties(msgForm,msg);
        msg.setUserId(userId);
        msgDao.addTweet(msg);
    }

    public List<Msg> getAllTweet() {
        return msgDao.getAllTweets();
    }
}
