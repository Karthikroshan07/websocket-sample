package com.websocketsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="userinfo")
public class UserEntity {

	@Id
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_id")
	private int userId;

	public UserEntity() {
		
	}

	public UserEntity(String userName, int userId) {
		this.userName = userName;
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
