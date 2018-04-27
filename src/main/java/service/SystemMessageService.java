package service;

import java.util.List;

import entity.Msg;
import entity.User;
import utils.MsgForm;

public interface SystemMessageService {
	/**
	 * check message exit
	 * @param msgContent part of message
	 * @return whether exit
	 */
	 public boolean exits(int userID, String msgSubContent);
	 /**
	  * save message
	  * @param messageContent Content of message
	  */
	 public void save(MsgForm msgForm);
	 /**
	  * delete system message
	  * @param msgID
	  */
	 public void deleteMessage(int msgID);
	 /**
	  * change message
	  * @param message
	  */
	 public void modifyMessage(Msg message);
	 /**
	  * query msg
	  * @param msgContent
	  * @return
	  */
	 public List<Msg> queryMessage(int userID, String msgContent);
}
