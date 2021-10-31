package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.auth.User;
import com.test.dao.UserRepo;

@RestController
public class UserController {

	@Autowired
	UserRepo userRepo;
	
	@PostMapping("/register")
	public User addUser(@RequestBody User user)
	{
		userRepo.save(user);
		return user;
	}
	@GetMapping("/login/")
	public void getUser()
	{
		
	}
	
}
