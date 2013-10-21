package com.xxzzsoftware.dao;

import java.util.List;

import com.xxzzsoftware.model.User;

public interface UserDao {
	
	public User saveUser(User user);
	
	public void deleteUser(User user);
	
	public User updateUser(User user);
	
	public User findUserById(int id);
	
	public List<User> findAllUser();

}
