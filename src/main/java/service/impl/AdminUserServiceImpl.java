package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import dao.UserDao;
import entity.User;
import service.AdminUserService;
import utils.UserForm;

public class AdminUserServiceImpl implements AdminUserService{

	@Autowired
	private UserDao userDao;
	@Override
	public Object regUser(UserForm userForm) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isUsernameExists(String username) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyUser(UserForm userForm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserForm getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(UserForm user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List queryUsers(String subUserName) {
		List<User> users = userDao.getAllUser();
		List<User> findUsers = new ArrayList<User>();
		for(User user:users){
			if(user.getUserName().lastIndexOf(subUserName) != -1){
				findUsers.add(user);
			}
		}
		return findUsers;
	}

	@Override
	public User login(UserForm userForm) throws HibernateException {
		
		 List<User> userList = userDao.getAllUser();
	        for(User user:userList){
	            if(user.getUserName().equals(userForm.getUsername())
	                    &&user.getPassword().equals(userForm.getPassword())&&user.getUserRole().equals("admin")){
	                return user;
	            }
	        }
	    return null;
	}

}
