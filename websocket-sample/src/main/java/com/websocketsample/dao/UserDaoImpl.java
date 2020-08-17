package com.websocketsample.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.websocketsample.model.CurrentUser;
import com.websocketsample.model.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public void saveData(UserEntity user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
	}
	
	@Override
	@Transactional
	public UserEntity getData(String userName) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(UserEntity.class, userName);
	}

	@Override
	public void saveCurrentUser(String userName) {
		Session session = entityManager.unwrap(Session.class);
		CurrentUser currentUser = new CurrentUser("1", userName);
		session.saveOrUpdate(currentUser);
	}

	@Override
	public String getCurrentUser() {
		Session session = entityManager.unwrap(Session.class);
		return session.get(CurrentUser.class, "1").getUserName();
	}

}
