package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.AdminUserService;
import utils.UserForm;

@Service
public class AdminUserServiceImpl implements AdminUserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void deleteUser(int userId) {
        User user = new User();
        user.setUserId(userId);
        userDao.deleteUser(user);

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
    public Object save(UserForm userForm) {
        User user = new User();
        BeanUtils.copyProperties(userForm,user);
        return userDao.saveObject(user);

    }

    @Override
    public List queryUsers(String subUserName) {
        List<User> users = userDao.getAllUser();
        List<User> findUsers = new ArrayList<User>();
        for(User user:users){
            if(subUserName == null)
                return users;
            else
            if(user.getUserName().lastIndexOf(subUserName) != -1){
                findUsers.add(user);
            }
        }
        return findUsers;
    }

    @Override
    public User login(UserForm userForm) throws HibernateException {

//        List<User> userList = userDao.getAllUser();
//        for(User user:userList){
//            if(user.getUserName().equals(userForm.getUsername())
//                    &&user.getPassword().equals(userForm.getPassword())&&user.getUserRole().equals("admin")){
//                return user;
//            }
//        }

        if(userForm.getUsername().equals("windpine")){

        }
        return userDao.getUser("windpine");
    }

}
