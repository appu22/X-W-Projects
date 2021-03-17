package com.xworkz.xworkzapp.customexception;

public class PhoneNumber extends RuntimeException {

	public PhoneNumber(String numbermsg) {
		super(numbermsg);
	}
}
