package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
