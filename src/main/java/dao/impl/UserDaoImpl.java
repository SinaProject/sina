package dao.impl;


import dao.UserDao;
import entity.User;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;




    /**
     *@描述 保存用户
     *@参数
     *@返回值
     */
    public Object saveObject(User user) throws HibernateException {
        return sessionFactory.getCurrentSession().save(user);
        
    }
    /**

     *@描述 获取单个用户

     *@参数

     *@返回值

     */

    public User getUser(Serializable id) throws HibernateException{
        return (User)sessionFactory.getCurrentSession().get(User.class,id);
    }

    /**

     *@描述 删除一个用户

     *@参数

     *@返回值

     */

    public void deleteUser(Serializable id) throws HibernateException {

    }

    /**

     *@描述

     *@参数

     *@返回值

     */
    public List<User> getAllUser() throws HibernateException {
        String hql = "FROM User";

        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();

    }

    public User getUser(String username) throws HibernateException {
        String hql="FROM User e WHERE e.userName=?";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0,username);
        return (User)query.list().get(0);
    }

    public void updateUser(User user, String userName){

        String password_=user.getPassword();
        String sex_=user.getSex();
        String userPhone_=user.getUserPhone();
        String userBlogAddress_=user.getUserBlogAddress();
        Date userBirth_=user.getUserBirth();
        String userInfo_=user.getUserInfo();

        String hql="UPDATE User u SET u.password=?, u.sex=?, u.userPhone=?, u.userBlogAddress=?, u.userBirth=?, u.userInfo=? WHERE u.userName=?";

        SQLQuery sqlQuery=sessionFactory.getCurrentSession().createSQLQuery(hql);
//        sqlQuery.setParameter(0,"111");
//        sqlQuery.setParameter(1,"女");
//        sqlQuery.setParameter(2,"111");
//        sqlQuery.setParameter(3,"111");
//        sqlQuery.setParameter(4,"1999-01-01");
//        sqlQuery.setParameter(5,"111");
//        sqlQuery.setParameter(6,"nicole");
//        sqlQuery.executeUpdate();
//
        sqlQuery.setParameter(0,password_);
        sqlQuery.setParameter(1,sex_);
        sqlQuery.setParameter(2,userPhone_);
        sqlQuery.setParameter(3,userBlogAddress_);
        sqlQuery.setParameter(4,userBirth_);
        sqlQuery.setParameter(5,userInfo_);
        sqlQuery.setParameter(6,userName);
        sqlQuery.executeUpdate();
    }
}
