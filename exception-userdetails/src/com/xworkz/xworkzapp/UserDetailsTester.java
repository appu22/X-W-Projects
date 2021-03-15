package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.UserDetailsDto;
import com.xworkz.xworkzapp.service.UserDetailsService;
import com.xworkz.xworkzapp.service.UserDetailsServiceImple;

public class UserDetailsTester {

	
	public static void main(String[] args) throws Throwable {
		
		UserDetailsDto detilas = new
				UserDetailsDto("appu", "appu@gmail.com", 8217237037l, 
						"Belagavi", "768454124");
		UserDetailsDto detilas1 = new
				UserDetailsDto("santu", "santu@gmail.com", 8214165037l, 
						"Belagavi", "768454124");
		UserDetailsDto detilas2 = new
				UserDetailsDto("darshan", "shrinivasgmail.com", 9787237037l, 
						"Belagavi", "768454124");
		UserDetailsDto detilas3 = new
				UserDetailsDto("teertha", "teertha@gmail.com", 6367237037l, 
						"Belagavi", "768454124");
	UserDetailsService imple = new UserDetailsServiceImple();
	
	imple.validateDetails(detilas);
	imple.validateDetails(detilas1);
	imple.validateDetails(detilas2);
	imple.validateDetails(detilas3);
	
	
	
	
	}
}
