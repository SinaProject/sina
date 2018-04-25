package service.impl;

import dao.UserDao;
import entity.User;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;
import utils.UserForm;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public Object regUser(UserForm userForm) throws HibernateException {
        User user = new User();
        user.setUserName(userForm.getUsername());
        user.setPassword(userForm.getPassword());
        user.setUserRole("user");
        return userDao.saveObject(user);

    }


    public User login(UserForm userForm) throws HibernateException {

        List<User> userList = userDao.getAllUser();
        for(User user:userList){
            if(user.getUserName().equals(userForm.getUsername())
                    &&user.getPassword().equals(userForm.getPassword())){
                return user;
            }
        }
        return null;
    }
}
