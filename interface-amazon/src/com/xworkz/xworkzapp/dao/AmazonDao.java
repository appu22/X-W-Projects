package com.xworkz.xworkzapp.dao;

import java.util.Date;

import com.xworkz.xworkzapp.dto.AmazonDto;

public interface AmazonDao {
	static final String username = "amazon@123.com";
	static final String password = "amazon123";

	public void viewSubscriber(String sub);

	public void loginId(String username, String password);

	public void addMovies(AmazonDto amazon);

	public void displayMovieDetails();

	default void displayDate() {
		System.out.println(new Date());
	}
}
