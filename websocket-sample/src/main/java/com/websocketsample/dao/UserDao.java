package com.websocketsample.dao;

import com.websocketsample.model.UserEntity;

public interface UserDao {
	
	public void saveData(UserEntity user);
	
	public UserEntity getData(String userName);

	public void saveCurrentUser(String userName);

	public String getCurrentUser();
}
