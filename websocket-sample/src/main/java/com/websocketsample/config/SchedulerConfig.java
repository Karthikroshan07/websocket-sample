package com.websocketsample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.websocketsample.service.UserService;

@Configuration
@EnableScheduling
public class SchedulerConfig {

	@Autowired
	SimpMessagingTemplate simpMessagingTemplate;
	
	@Autowired
	UserService userService;
	
	@Scheduled(fixedDelay = 1000)
	public void getUserId() {
		simpMessagingTemplate.convertAndSend("/topic/sample", userService.getData(userService.getCurrentUser()));
	}
}
