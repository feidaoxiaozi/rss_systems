package net.wukong.service.impl;

import net.wukong.dao.UserDao;
import net.wukong.service.UserService;


public class UserServiceImpl implements UserService {

	private UserDao userDao;// �˴���dao�Ľӿ���ΪUserServiceImpl������ԣ�Ȼ��ͨ��spring�����ļ���������ע��

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
	

