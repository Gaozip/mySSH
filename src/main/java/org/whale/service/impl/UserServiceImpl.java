package org.whale.service.impl;

import org.whale.dao.UserDao;
import org.whale.entity.User;
import org.whale.service.UserService;

import java.util.List;

/**
 * @Author: gzip
 * @Date: 2020/6/17  9:22
 * @Description:
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUser(int id) {
        User user = userDao.findById(id);
        return user;
    }

    public void doSave(User user) {
        userDao.doSave(user);
    }

    public List<User> queryAll() {
        return userDao.findAll();
    }
}
