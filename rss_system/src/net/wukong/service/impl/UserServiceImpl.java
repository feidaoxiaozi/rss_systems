package net.wukong.service.impl;

import net.wukong.dao.UserDao;
import net.wukong.service.UserService;


public class UserServiceImpl implements UserService {

	private UserDao userDao;// 此处将dao的接口作为UserServiceImpl类的属性，然后通过spring配置文件进行依赖注入

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean verifyUser(String username,String password) {		
			int result = userDao.verifyUser(username, password);
			if (1 == result) {
				return true;
			} else {
				return false;
			}
		}
	}
	

