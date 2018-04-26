package dao;

import entity.User;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void saveObjectTest() {
        User user= new User();
        user.setUserName("ynh");
        user.setPassword("123456");

        userDao.saveObject(user);

    }

    @Test
    public void getObjectTest() {
        User user = userDao.getUser(11);

        System.out.println(user.getUserName());
    }

    @Test
    public void getUserByUsername(){
        String username="windpine";
        Assert.assertNotNull(userDao.getUser(username));
    }

    @Test
    public void update(){
        User user= new User();
        //user.setPassword("11111");
        //user.setUserRole("user");
        user.setUserInfo("333");
        user.setUserName("nicole2");
        user.setUserId(11);

        String hql="UPDATE User u SET u.password=?, u.sex=?, u.userPhone=?, u.userBlogAddress=?, u.userBirth=?, u.userInfo=? WHERE u.userName=?";

        SQLQuery sqlQuery=sessionFactory.getCurrentSession().createSQLQuery(hql);
        sqlQuery.setParameter(0,"111");
        sqlQuery.setParameter(1,"女");
        sqlQuery.setParameter(2,"111");
        sqlQuery.setParameter(3,"111");
        sqlQuery.setParameter(4,"1999-01-01");
        sqlQuery.setParameter(5,"111");
        sqlQuery.setParameter(6,"nicole2");
        sqlQuery.executeUpdate();

        User user_ = userDao.getUser(11);

        System.out.println(user_.getUserBirth());




    }
}