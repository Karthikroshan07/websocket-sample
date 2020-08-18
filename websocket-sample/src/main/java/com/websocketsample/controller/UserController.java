package com.websocketsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websocketsample.model.UserEntity;
import com.websocketsample.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/sendMessage")
	public String sendMessage(Model model) {
		model.addAttribute(new UserEntity());
		return "send-message";
	}

	@RequestMapping("/viewMessage") 
	public String viewMessage(@ModelAttribute("userEntity") UserEntity user) {
		return "view-message";
	}
	
	@RequestMapping("/update") 
	public String updateData(@ModelAttribute("userEntity") UserEntity user) {
		userService.saveData(user);
		return "send-message";
	}
	
}
