package net.wukong.dao.impl;

import net.wukong.dao.UserDao;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	public int verifyUser(String username,String password) {
		Query query = getSession().createQuery("select count(u.userId) from User u where u.username = ? and u.password = ?");
		query.setParameter(0, username);
		query.setParameter(1, password);
		return Integer.parseInt(query.uniqueResult().toString());
	}
}
