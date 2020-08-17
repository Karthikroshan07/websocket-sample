package com.websocketsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="currentuser")
public class CurrentUser {

	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "user_name")
	private String userName;
	
	public CurrentUser() {
		
	}

	public CurrentUser(String id, String userName) {
		this.id = id;
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
