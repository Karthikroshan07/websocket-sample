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

	@RequestMapping("/user")
	public String loadScreen(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		userService.saveCurrentUser(auth.getName());
		model.addAttribute(new UserEntity());
		return "home";
	}

	@RequestMapping("/update") 
	public String updateData(@ModelAttribute("userEntity") UserEntity user) {
		userService.saveData(user);
		return "home";
	}

}
