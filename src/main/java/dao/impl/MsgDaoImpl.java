package dao.impl;

import dao.MsgDao;
import entity.Msg;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @anthor tanshangou
 * @time 2018/3/30
 * @description
 */

@Repository
@Transactional
public class MsgDaoImpl implements MsgDao {

    @Autowired
    SessionFactory sessionFactory;

    /**

     *@描述 获得某一用户的某一条微博

     *@参数  int msgId, int userId

     *@返回值  Msg

     */
    public Msg getTweet(int msgId) {
      return (Msg)sessionFactory.getCurrentSession().get(Msg.class,msgId);
    }

    /**

     *@描述 获得某一用户的所有微博

     *@参数  int userId

     *@返回值  List<Msg>

     */

    public List getAllTweetsForUser(int userId) {
        String hql = "FROM Msg e WHERE e.userId=?";

        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0,userId);
        return query.list();
    }

    public List<Msg> getAllTweets() {
        String hql = "FROM Msg";

        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }

    /**

     *@描述 增加一条微博

     *@参数  Msg msg

     *@返回值

     */

    public void addTweet(Msg msg) {
        sessionFactory.getCurrentSession().save(msg);
    }

    /**

     *@描述 删除一条微博

     *@参数  int msgId,int userId

     *@返回值

     */

    public void deleteTweet(int msgId) {
        Msg msg = getTweet(msgId);
        if(msg!=null){
            sessionFactory.getCurrentSession().delete(msg);
        }else {
            //TODO 删除的异常处理
        }

    }

    /**
     * 更新点赞数
     * @param msgId
     */

    public void updateTweetOnLike(int msgId) {

        String sql="UPDATE msg SET msgZanNum=msgZanNum+1 WHERE msgId=?";
        SQLQuery sqlQuery=sessionFactory.getCurrentSession().createSQLQuery(sql);
        sqlQuery.setParameter(0,msgId);
        sqlQuery.executeUpdate();
    }
}
