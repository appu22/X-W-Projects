package com.xworkz.xworkzapp.customexception;

public class UserName extends RuntimeException{
	
	public UserName(String name) {
		super(name);
	}

}
