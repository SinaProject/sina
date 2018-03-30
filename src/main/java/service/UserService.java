package service;

import dao.UserDao;
import entity.User;
import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.UserForm;

@Service
public class UserService {

    @Autowired
    private UserDao dao;

    public void regUser(UserForm userForm) throws HibernateException {
        User user = new User();
        user.setUserName(userForm.getUsername());
        user.setPassword(userForm.getPassword());
        dao.saveObject(user);
    }


}