package org.whale.dao;

import org.whale.entity.User;

import java.util.List;

/**
 * @Author: gzip
 * @Date: 2020/6/17  16:16
 * @Description:
 **/
public interface UserDao {

    User findById(int id);

    void doDelete(int id);

    List<User> findAll();

    void doSave(User user);

    void doUpdate(User user);
}
