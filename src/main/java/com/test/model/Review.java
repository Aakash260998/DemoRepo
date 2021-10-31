package com.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.test.auth.User;

@Entity
public class Review {

	@Id
	@GeneratedValue
	int id;
	@ManyToOne
	 Product product;
	@OneToOne
    User user;
	 int ratings; 
	 String reviewDescription;
	
	public Review() {
		super();
	}
	
	

	public Review(Product product, User user, int ratings, String reviewDescription) {
		super();
		this.product = product;
		this.user = user;
		this.ratings = ratings;
		this.reviewDescription = reviewDescription;
	}



	public Review(int id, Product product, User user, int ratings, String reviewDescription) {
		super();
		this.id = id;
		this.product = product;
		this.user = user;
		this.ratings = ratings;
		this.reviewDescription = reviewDescription;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public int getRatings() {
		return ratings;
	}



	public void setRatings(int ratings) {
		this.ratings = ratings;
	}



	public String getReviewDescription() {
		return reviewDescription;
	}



	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}



	@Override
	public String toString() {
		return "Review [id=" + id + ", product=" + product + ", user=" + user + ", ratings=" + ratings
				+ ", reviewDescription=" + reviewDescription + "]";
	}
	
}