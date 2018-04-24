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

    /**
     * 1. 检查是否为转发的微博
     *      若Y，则再判断该微博是否第一次转发，赋初始值
     *      否，则直接在原有值上+1
     * 2. 上面的逻辑可以通过在Dao层编写SQL语句代替（潜在的未来优化项）
     * 3. 发送微博时均要初始化赞数为0
     * @param msgForm
     */
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
        msg.setMsgZanNum(0);
        msgDao.addTweet(msg);
    }
    public List<Msg> getAllTweet() {
        return msgDao.getAllTweets();
    }


    /**
     * 通过Dao层的定向SQL更新语句实现
     * @param msgId
     */
    public void likeTeet(int msgId) {
        msgDao.updateTweetOnLike(msgId);
    }
}
