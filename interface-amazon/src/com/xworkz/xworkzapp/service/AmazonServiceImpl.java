package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.AmazonDao;
import com.xworkz.xworkzapp.dao.AmazonDaoImpl;
import com.xworkz.xworkzapp.dto.AmazonDto;

public class AmazonServiceImpl implements AmazonService {

	private AmazonDao daoimpl = new AmazonDaoImpl();

	@Override
	public void loginId(String usern, String pass) {
		if (usern != null && usern.contains("@") && usern.contains(".com") && pass.length() > 6 ){
			daoimpl.loginId(usern, pass);
			System.out.println("user name     : "+AmazonDao.username);
			System.out.println("user password : "+AmazonDao.password);
			//System.out.println("Login Successfull...");
		}else{
			System.out.println("Please Enter Valid Cridentails ");
		}
	}

	@Override
	public void addMovies(AmazonDto Moviename) {
		if (Moviename != null) {
			daoimpl.addMovies(Moviename);
			System.out.println("adding movies ...service imple");
		} else {
			System.out.println(" invalid movie name ");
		}

	}

	@Override
	public void displayMovieDetails() {
		System.out.println("Display MOvie Details ....");
		daoimpl.displayMovieDetails();

	}

	@Override
	public void subscribers() {
		System.out.println("Subcriber Viewers list");
		daoimpl.viewSubscriber(null);
		
		
	}

}
