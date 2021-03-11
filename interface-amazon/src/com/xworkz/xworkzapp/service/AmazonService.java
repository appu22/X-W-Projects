package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.AmazonDto;

public interface AmazonService {

	public void loginId(String username, String password);

	public void addMovies(AmazonDto amazonDTO);

	public void displayMovieDetails();
	
	public void subscribers();

}
