package service.impl;

import dao.UserDao;
import entity.User;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;
import utils.UserForm;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    /**
     *  由于userRole为非空字段
     *  这里默认注册时将用户设置为普通用户身份
     *  （将来可进一步进行身份验证优化）
     * @param userForm
     * @return
     * @throws HibernateException
     */
    public Object regUser(UserForm userForm) throws HibernateException {
        User user = new User();
        user.setUserName(userForm.getUsername());
        user.setPassword(userForm.getPassword());
        user.setUserRole("user");
        return userDao.saveObject(user);

    }


    public User login(UserForm userForm) throws HibernateException {

        List<User> userList = userDao.getAllUser();
        for(User user:userList){
            if(user.getUserName().equals(userForm.getUsername())
                    &&user.getPassword().equals(userForm.getPassword())){
                return user;
            }
        }
        return null;
    }


    /**
     * 验证用户名是否重复时用到的逻辑
     * Dao层由Byname查询实现
     * @param username
     * @return
     * @throws HibernateException
     */

    public Boolean isUsernameExists(String username) throws HibernateException {
        if(userDao.getUser(username)!=null){
            return true;
        }
        return false;
    }

    public List<User> getAll(){
        return userDao.getAllUser();
    }

    public User getByUserName(String userName){
        List<User> userList = userDao.getAllUser();
        for(User user:userList){
            if(user.getUserName().equals(userName)
                    &&user.getPassword().equals(userName)){
                return user;
            }
        }
        return null;
    }

    public void addUser(User user){

    }

    public void updateUser(User user){
        userDao.updateUser(user);



    }
}
