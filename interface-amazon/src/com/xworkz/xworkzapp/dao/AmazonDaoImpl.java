package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.AmazonDto;

public class AmazonDaoImpl implements AmazonDao {

	AmazonDto dto[] = new AmazonDto[5];
	int index = 0;

	String subscriber[] = { "appu", "Teertha", "Darshan", "Santosh" };

	@Override
	public void loginId(String user, String pass) {
		if (user.equals(username) && pass.equals(password)) {
			System.out.println("Welcome to amazon...");
		} else {
			System.out.println("invalid Credentails");
		}

	}

	@Override
	public void addMovies(AmazonDto amazon) {
		dto[index] = amazon;
		index++;
		System.out.println("details Added successfull...");
	}

	@Override
	public void displayMovieDetails() {
		for (int i = 0; i < index; i++) {
			if (dto[i] != null) {
				System.out.println("Movie Name  is		 	: " + dto[i].getMovieName());
				System.out.println("Movie Actor  is 	 	: " + dto[i].getActor());
				System.out.println("Movie Actress 		        : " + dto[i].getActoress());
				System.out.println("Movie MovieSize MB is           : " + dto[i].getSize());

			}
		}

	}

	@Override
	public void viewSubscriber(String sub) {
		for (int i = 0; i < subscriber.length; i++) {
			System.out.println("Subscriber Viewers : " + subscriber[i]);

		}

	}

}
