package com.websocketsample.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websocketsample.dao.UserDao;
import com.websocketsample.model.UserEntity;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	@Transactional
	public void saveData(UserEntity user) {
		userDao.saveData(user);
	}
	
	@Override
	@Transactional
	public UserEntity getData(String userName) {
		return userDao.getData(userName);
	}

	@Override
	@Transactional
	public void saveCurrentUser(String userName) {
		userDao.saveCurrentUser(userName);
	}

	@Override
	@Transactional
	public String getCurrentUser() {
		return userDao.getCurrentUser();
	}

}
