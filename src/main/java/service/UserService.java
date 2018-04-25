package service;

import dao.UserDao;
import entity.User;
import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.UserForm;

public interface UserService {



    Object regUser(UserForm userForm) throws HibernateException;

    User login(UserForm userForm) throws HibernateException;

}