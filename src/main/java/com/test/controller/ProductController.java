package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.test.dao.ProductRepo;
import com.test.dao.UserRepo;

@RestController
public class ProductController {

	@Autowired
	UserRepo userRepo;
	@Autowired
	ProductRepo productRepo;
}
