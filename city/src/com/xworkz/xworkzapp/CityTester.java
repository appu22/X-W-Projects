package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.CityDTO;

public class CityTester {
	public static void main(String[] args) {	
		System.out.println("Main method started");
		CityDTO city = new CityDTO();
		city.setCityName("Belagavi");
		System.out.println(city.getCityName());
		System.err.println("main method ended");		
	}
}
