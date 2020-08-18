package com.websocketsample.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
	public List<UserEntity> getData() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from UserEntity").getResultList();
	}

}
