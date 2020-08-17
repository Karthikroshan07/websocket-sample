package com.websocketsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.websocketsample.model.UserEntity;
import com.websocketsample.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public String getUser(@RequestBody UserEntity user) {
		userService.saveData(user);
		return "User data added!";
	}
}
