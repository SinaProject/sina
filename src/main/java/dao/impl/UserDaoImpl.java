package dao.impl;


import dao.UserDao;
import entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
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
}
