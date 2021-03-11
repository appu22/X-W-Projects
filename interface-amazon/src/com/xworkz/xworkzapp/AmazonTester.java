package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.AmazonDto;
import com.xworkz.xworkzapp.service.AmazonService;
import com.xworkz.xworkzapp.service.AmazonServiceImpl;

public class AmazonTester {

	public static void main(String[] args) {

		AmazonDto amazonDTO = new AmazonDto("amazon@123.com", "amazon123", "Robert", "500Mb", "Darshan", "AshaBhatt");
		//AmazonDto amz = new AmazonDto("amazon@456.com", "amazon456", "Yuvaratna", "600Mb", "Puneeth", "Sayyeshaa");

		AmazonService amazon = new AmazonServiceImpl();

		amazon.addMovies(amazonDTO);
		//amazon.addMovies(amz);

		amazon.loginId("amazon@123.com", "amazon123");
		amazon.displayMovieDetails();

		amazon.subscribers();
	}

}
