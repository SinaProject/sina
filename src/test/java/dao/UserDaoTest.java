package dao;

import entity.User;
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

    @Test
    public void saveObjectTest() {
        User user= new User();
        user.setUserName("tanshangou");
        user.setPassword("123456");

        userDao.saveObject(user);

    }

    @Test
    public void getObjectTest() {
        User user = userDao.getUser(1);

        System.out.println(user.getUserName());
    }
}