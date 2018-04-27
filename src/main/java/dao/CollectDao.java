package dao;

import entity.Collect;

import java.io.Serializable;
import java.util.List;

/**
 * @anthor tanshangou
 * @time 2018/4/23
 * @description
 */
public interface CollectDao {

    public List<Collect> getCollectsByUser(int userId);

    public Object addCollect(Collect collect);

    public void deleteCollect(int msgId,int userId) throws Exception;


}
