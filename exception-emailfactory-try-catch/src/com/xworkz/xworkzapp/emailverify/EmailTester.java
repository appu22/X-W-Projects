package com.xworkz.xworkzapp.emailverify;

public class EmailTester {
	public static void main(String[] args) {
		System.out.println("Program start");
		//try catch block
		EmailDisplay email = new EmailDisplay();
		email.displayEmail("afg");
		email.displayEmail("app@gmaail.com");
		System.out.println("Program End");
	}
	

}
