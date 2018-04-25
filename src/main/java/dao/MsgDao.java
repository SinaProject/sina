package dao;

import entity.Msg;

import java.util.List;

public interface MsgDao {

    /**
     * 获得某一用户的某一微博
     * 通常情况下，业务逻辑中不需要用到该操作
     * 仅仅提供这个接口方便开发
     * @param msgId
     * @return
     */

    Msg getTweet(int msgId);


    /**获取用户的所有微博
     *
     * @param userId
     * @return
     */

    List getAllTweetsForUser(int userId);

    List<Msg> getAllTweets();

    //增加微博

    void addTweet(Msg msg);

    /**
     * 同理，直接删除一条微博在业务中也不常见
     * @param msgId
     */

    void deleteTweet(int msgId);



    //编辑微博(实现使可通过对象复制)


    void updateTweet(Msg msg);


}
