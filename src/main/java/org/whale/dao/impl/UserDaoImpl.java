package org.whale.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.whale.dao.UserDao;
import org.whale.entity.User;

import java.util.List;

/**
 * @Author: gzip
 * @Date: 2020/6/17  16:16
 * @Description:
 **/
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    public User findById(int id) {
        return this.getHibernateTemplate().get(User.class,id);
    }

    public void doDelete(int id) {

        User user = this.findById(id);
        this.getHibernateTemplate().delete(user);
    }

    public List<User> findAll() {
        return (List<User>) this.getHibernateTemplate().find("from User");
    }

    public void doSave(User user) {
        this.getHibernateTemplate().save(user);
    }

    public void doUpdate(User user) {
        this.getHibernateTemplate().update(user);
    }
}
