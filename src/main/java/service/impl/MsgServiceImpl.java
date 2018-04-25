package service.impl;

import dao.MsgDao;
import dao.UserDao;
import entity.Msg;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void addTweet(MsgForm msgForm) {

        Msg msg = new Msg();
        BeanUtils.copyProperties(msgForm,msg);
        if(msg.getMsgIsForward().equals("Y")){
            Integer currentForwardNum = msgDao.getTweet(msgForm.getForwardId()).getMsgForward();
            if(currentForwardNum==null){
                currentForwardNum=1;
            }
            msg.setMsgForward(currentForwardNum+1);
        }
        msg.setUserId(msgForm.getUserId());
        msg.setUserName(userDao.getUser(msg.getUserId()).getUserName());
        msgDao.addTweet(msg);
    }
    public List<Msg> getAllTweet() {
        return msgDao.getAllTweets();
    }
}
