package service.impl;

import dao.CollectDao;
import entity.Collect;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CollectService;
import utils.MsgForm;

import java.util.List;

/**
 * @anthor tanshangou
 * @time 2018/4/24
 * @description
 */

@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    CollectDao collectDao;



    public Object addCollect(int userId,int msgId) {
        Collect collect = new Collect();

        collect.setMsgId(msgId);
        collect.setUserId(userId);

        return collectDao.addCollect(collect);
    }

    public void deleteCollect(int msgId,int userId) throws Exception {

        collectDao.deleteCollect(msgId,userId);
    }

    public List<Collect> getAllCollectsByUser(int userId) {

        return collectDao.getCollectsByUser(userId);
    }
}
