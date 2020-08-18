package com.websocketsample.service;

import java.util.List;

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
	public List<UserEntity> getData() {
		return userDao.getData();
	}

}
