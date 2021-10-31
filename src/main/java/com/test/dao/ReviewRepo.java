package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Review;

public interface ReviewRepo extends JpaRepository<Review,Integer> {

}
