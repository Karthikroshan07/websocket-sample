package com.websocketsample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(users.username("karthik").password("123").roles("Employee"))
		.withUser(users.username("vijay").password("123").roles("Employee"));
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
//		For screen
		http
		.csrf().disable()
		.authorizeRequests()
		.anyRequest().authenticated()
		.and()
		.formLogin().permitAll();
		
//		For API
//		http
//		.csrf().disable()
//		.authorizeRequests()
//		.antMatchers("/").permitAll()
//		.antMatchers(HttpMethod.POST,"/user").permitAll()
//		.anyRequest().authenticated();
	}
	
}
