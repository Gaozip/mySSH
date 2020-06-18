package org.whale.service;

import org.whale.entity.User;

import java.util.List;

/**
 * @Author: gzip
 * @Date: 2020/6/17  9:23
 * @Description:
 **/
public interface UserService {

     User getUser(int id);

     void doSave(User user);

     List<User> queryAll();
}
