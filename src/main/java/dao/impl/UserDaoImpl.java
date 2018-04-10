package dao.impl;


import dao.UserDao;
import entity.User;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

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
    public void saveObject(User user) throws HibernateException {
        sessionFactory.getCurrentSession().save(user);
        
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

}
