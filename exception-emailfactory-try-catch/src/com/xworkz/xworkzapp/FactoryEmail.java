package com.xworkz.xworkzapp;

public class FactoryEmail {
	String emailFactString[] = new String[5];
	int index=0;

	public FactoryEmail() {
		System.out.println("Email Factory constructor");
	}
	
	public void addFact(String email) {
		System.out.println("Inside Add email method ");
		try {
			if(email.length()>3) {
			emailFactString[index]=email;	
			index++;
//		throw new RuntimeException("Email invalid");
			}else {
				throw new RuntimeException("Email invalid"); 
			}
		}catch (Exception e) {  //RuntimeException
			System.out.println("Exception occured");
		}
		System.out.println("inside addnfact method end");
		
	}
}
