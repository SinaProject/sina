package dao;

import entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")

public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void saveObjectTest() {
        User user= new User();
        user.setUserName("yuyu");
        user.setPassword("666");

        userDao.saveObject(user);

    }

    @Test
    public void getObjectTest() {
        User user = userDao.getObject(1);

        System.out.println(user.getUserName());
    }
}