package dao;


import entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;


public interface UserDao {



     Object saveObject(User user) throws HibernateException ;

     User getUser(Serializable id) throws HibernateException;

     void deleteUser(User user) throws HibernateException;

     //获取所有用户

     List<User> getAllUser() throws HibernateException;

     //获取用户名对应用户

     User getUser(String username) throws HibernateException;


     //修改用户信息
     void updateUser(User user, String userName);
}
