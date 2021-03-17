package com.xworkz.xworkzapp.emailverify.customException;

public class InvalidEmail extends RuntimeException{
	
	public InvalidEmail(String emailMsg) {
		super(emailMsg);
	}

}
