package dao;

import entity.Fans;

import java.util.List;


public interface FansDao {

	public Object addFollow(int followId, int userId);
	
//	public void deleteFollow();
	
	public List getFollowsById(int userId);
	
//	public void deleteFans();
	
	public List getFansById(int userId);
	
	
	public void deleteFans(int fansId, int userId) throws Exception;;
	
	
}
 