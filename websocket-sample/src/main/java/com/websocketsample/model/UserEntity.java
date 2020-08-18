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
	
	@Column(name = "message")
	private String message;

	public UserEntity() {
		
	}

	public UserEntity(String userName, String message) {
		this.userName = userName;
		this.message = message;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
