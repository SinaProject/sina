package service;

import entity.Msg;
import entity.User;
import utils.MsgForm;

import java.util.List;

/**
 * @anthor tanshangou
 * @time 2018/4/10
 * @description
 */
public interface MsgService {


    //
    public void addTweet(MsgForm msgForm,int userId);

    //
    public List<Msg> getAllTweet();
}
