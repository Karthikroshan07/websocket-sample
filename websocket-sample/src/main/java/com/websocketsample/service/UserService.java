package com.websocketsample.service;

import com.websocketsample.model.UserEntity;

public interface UserService {
	
	public void saveData(UserEntity user);
	
	public UserEntity getData(String userName);

	public void saveCurrentUser(String userName);

	public String getCurrentUser();

}
