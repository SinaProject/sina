package service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import utils.UserForm;

import static org.junit.Assert.*;

/**
 * Created by niccoleynh on 2018/4/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AdminUserServiceTest {

    @Autowired
    AdminUserService adminUserService;

    @Test
    public void deleteUser() throws Exception {

    }

    @Test
    public void modifyUser() throws Exception {

    }

    @Test
    public void getUser() throws Exception {

    }

    @Test
    public void save() throws Exception {

    }

    @Test
    public void queryUsers() throws Exception {

    }

    @Test
    public void login() throws Exception {

        UserForm userForm = new UserForm();
        userForm.setUserRole("admin");
        userForm.setUsername("windpine");
        userForm.setPassword("5b90900d93b49e66e3c82ca2b88ed997");



        Assert.assertNotNull(adminUserService.login(userForm));
    }

}