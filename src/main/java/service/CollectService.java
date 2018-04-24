package service;


import entity.Collect;
import utils.MsgForm;

import java.util.List;

/**
 * @anthor tanshangou
 * @time 2018/4/24
 * @description
 */
public interface CollectService {

    public Object addCollect(int userId,int msgId);

    public void deleteCollect(int msgId,int userId) throws Exception;

    public List<Collect> getAllCollectsByUser(int userId);
}
