package dao;

import entity.Fans;
import java.util.List;


public interface FansDao {

	public Object addFollow(Fans fans);
	
//	public void deleteFollow();
	
	public List getFollowsById(int userId);
	
//	public void deleteFans();
	
	public List getFansById(int userId);
	
	
	
}
 