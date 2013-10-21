package com.xxzzsoftware.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xxzzsoftware.dao.UserDao;
import com.xxzzsoftware.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		return (User)session.save(user);
	}

	@Override
	public void deleteUser(User user) {
		//this.getHibernateTemplate().delete(user);
		Session session = sessionFactory.getCurrentSession();
		session.delete(user);;
	}

	@Override
	public User updateUser(User user) {
		this.getHibernateTemplate().saveOrUpdate(user);
		return null;
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
