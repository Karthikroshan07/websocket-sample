package com.websocketsample.service;

import java.util.List;

import com.websocketsample.model.UserEntity;

public interface UserService {
	
	public void saveData(UserEntity user);
	
	public List<UserEntity> getData();

}
