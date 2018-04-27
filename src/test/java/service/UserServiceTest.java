package service;

import entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import utils.UserForm;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void regUserTest() {
        UserForm user = new UserForm();
        user.setUsername("windpine");
        user.setPassword("23333");
        userService.regUser(user);
    }

    @Test
    public void loginTest(){
        UserForm user = new UserForm();
        user.setUsername("windpine");
        user.setPassword("23333");
        Assert.assertNotNull(userService.login(user));
    }

    @Test
    public void validation(){
        Boolean usernameExists=userService.isUsernameExists("tanshangou");

        System.out.println(usernameExists);
    }
}