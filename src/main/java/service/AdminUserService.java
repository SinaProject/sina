package service;

import java.util.List;

import org.hibernate.HibernateException;

import entity.User;
import utils.UserForm;

public interface AdminUserService{

    void deleteUser(int userId);
    void modifyUser(UserForm userForm);
    UserForm getUser(int userId);
    Object save(UserForm userForm);
    List queryUsers(String subUserName);
    User login(UserForm userForm) throws HibernateException;
}
