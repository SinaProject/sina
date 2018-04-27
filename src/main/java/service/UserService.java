package service;

import dao.UserDao;
import entity.User;
import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.UserForm;

import java.util.List;

public interface UserService {



    Object regUser(UserForm userForm) throws HibernateException;

    User login(UserForm userForm) throws HibernateException;

    Boolean isUsernameExists(String username) throws HibernateException;

    void updateUser(User user,String userName);

    List<User> getAll();

    User getByUserName(String userName);

    void addUser(User user);

    User  getByUserId(Integer userId);

    User getUserById(int userId);
}