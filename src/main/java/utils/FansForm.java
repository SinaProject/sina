package utils;


public class FansForm {

	//被关注人的ID
	private int fansId;
	//关注人的ID
	private int userId;
	
	public int getFansId(){
		return fansId;
	}
	
	public void setFansId(int fansId){
		this.fansId=fansId;
	}
	
	public int getUserId(){
		return userId;
	}
	
	public void setUserId(int userId){
		this.userId=userId;
	}
}
