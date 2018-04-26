package service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Msg;
import service.HotPointService;
import dao.MsgDao;
@Service("hotPointService")
public class HotPointServiceImp implements HotPointService {
	@Autowired
	private MsgDao msgDao;
	/**
	 * bubble find
	 * @return recent high collect msg content
	 */
	@Override
	public String searchHotPoint() {
		List<Msg> msgs = msgDao.getAllTweets();
		Timestamp now = new Timestamp(System.currentTimeMillis());
		Timestamp monthago = new Timestamp(System.currentTimeMillis() - 86400);
		Integer mostCollectMsg = new Integer(0);
		String msgContent = null;
		for(Msg msg :msgs){
			//check the recent date
			if(msg.getMsgDate().compareTo(now) < 0 && msg.getMsgDate().compareTo(monthago) > 0){
				//find most high collect msg
				if(msg.getMsgCollectNum().compareTo(mostCollectMsg) != -1){
					mostCollectMsg = msg.getMsgCollectNum();
					msgContent = msg.getMsgContent();
				}
			}
		}
		return msgContent;
	}

}
