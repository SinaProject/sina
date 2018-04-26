package service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import dao.MsgDao;
import dao.UserDao;
import entity.Msg;
import org.springframework.stereotype.Service;
import service.SystemMessageService;
import utils.MsgForm;

@Service
public class SystemMessageServiceImp implements SystemMessageService {	
	@Autowired
	private MsgDao msgDao;
	@Autowired
	private UserDao userDao;
	@Override
	public boolean exits(int userID, String msgSubContent) {
		List<Msg> msgs = msgDao.getAllTweetsForUser(userID);
		for(Msg msg:msgs){
			if(msg.getMsgContent().lastIndexOf(msgSubContent) != -1){
				return true;
			}
		}
		return false;
	}

	@Override
	public void save(MsgForm msgForm) {
		Msg msg = new Msg();
		BeanUtils.copyProperties(msgForm,msg);
		msgDao.addTweet(msg);
	}

	@Override
	public void deleteMessage(int msgID) {
		msgDao.deleteTweet(msgID);
	}

	/*@Override
	public void modifyMessage(Msg message) {
		msgDao.updateTweet(message);
	}*/

	@Override
	public List<Msg> queryMessage(int userID, String msgSubContent) {
		List<Msg> queryMsgs = new LinkedList<Msg>();
		List<Msg> msgs = msgDao.getAllTweetsForUser(userID);
		for(Msg msg:msgs){
			if(msg.getMsgContent().lastIndexOf(msgSubContent) != -1){
				queryMsgs.add(msg);
			}
		}
		return queryMsgs;
	}

	@Override
	public void modifyMessage(Msg message) {
		// TODO Auto-generated method stub
		
	}}
