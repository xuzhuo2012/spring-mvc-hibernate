package com.xxzzsoftware.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xxzzsoftware.dao.UserDao;
import com.xxzzsoftware.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		session.flush();
		return user;
	}

	@Override
	public void deleteUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(user);
		session.flush();
	}

	@Override
	public User updateUser(User user) {
		//this.getHibernateTemplate().saveOrUpdate(user);
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		return user;
	}

	@Override
	public User findUserById(int id) {
		return null;
	}

	@Override
	public List<User> findAllUser() {
		return null;
	}

}
