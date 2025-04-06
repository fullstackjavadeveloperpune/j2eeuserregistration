package com.fullstack.service;

import com.fullstack.dao.UserDao;
import com.fullstack.dao.UserDaoImpl;
import com.fullstack.model.User;

public class UserServiceImpl implements UserService{

	UserDao userDao = new UserDaoImpl();
	
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		userDao.registerUser(user);
	}

}
