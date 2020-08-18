package com.websocketsample.dao;

import java.util.List;

import com.websocketsample.model.UserEntity;

public interface UserDao {
	
	public void saveData(UserEntity user);
	
	public List<UserEntity> getData();
}
