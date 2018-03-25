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

@Repository
@Transactional
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;


    public void saveObject(User user) throws HibernateException {
        sessionFactory.getCurrentSession().save(user);
    }

    public User getObject(Serializable id) throws HibernateException{
        return (User)sessionFactory.getCurrentSession().get(User.class,id);
    }

}
