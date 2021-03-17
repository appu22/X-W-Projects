package com.xworkz.xworkzapp.customexception
;

public class InvalidEmail extends RuntimeException{
	
	public InvalidEmail(String email) {
		super(email);
	}

}
