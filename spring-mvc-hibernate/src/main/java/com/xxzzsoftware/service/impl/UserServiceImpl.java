package com.xxzzsoftware.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxzzsoftware.dao.UserDao;
import com.xxzzsoftware.model.User;
import com.xxzzsoftware.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User register(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public User login(User user) {
		User u = userDao.findUserById(user.getId());
		return u;
	}

	@Override
	public User updateInfo(User user) {
		User u = userDao.updateUser(user);
		return u;
	}

}
