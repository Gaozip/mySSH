package org.whale.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.whale.entity.User;

/**
 * @Author: gzip
 * @Date: 2020/6/17  9:20
 * @Description:
 **/
public class UserDao extends HibernateDaoSupport {

    public User getUser(int id) {
        return this.getHibernateTemplate().get(User.class, id);
    }
}
