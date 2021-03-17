package com.xworkz.xworkzapp.emailverify;

public class Email {

	String emailString[] = new String[5];
	int index = 0;

	public Email() {
		System.out.println("Inside constructor");
	}

	public  void addEmaildetails(String email) {
			emailString[index] = email;
			index++;
			System.out.println("Email added successfull");

	}
}
