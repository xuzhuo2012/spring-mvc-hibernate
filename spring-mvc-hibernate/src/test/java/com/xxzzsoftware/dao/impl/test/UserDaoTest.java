package com.xxzzsoftware.dao.impl.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xxzzsoftware.model.User;



@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Test
	@Transactional
	public void testSaveUser() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		User user = new User();
		user.setUsername("xuzhuo");
		user.setPassword("shuang");
		user.setDate(new Date());
		session.save(user);
		session.flush();
	}

}
