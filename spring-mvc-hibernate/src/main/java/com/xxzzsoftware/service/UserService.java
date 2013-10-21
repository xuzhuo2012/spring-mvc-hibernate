package com.xxzzsoftware.service;

import com.xxzzsoftware.model.User;

public interface UserService {
	
	public User register(User user);
	
	public User login(User user);
	
	public User updateInfo(User user);
	
}
