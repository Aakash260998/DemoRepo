package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.auth.User;


public interface UserRepo extends JpaRepository<User,String> {

	
}
