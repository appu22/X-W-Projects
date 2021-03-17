package com.xworkz.xworkzapp.emailverify;

import com.xworkz.xworkzapp.emailverify.customException.InvalidEmail;

public class EmailDisplay {
	Email em = new Email();

	public void displayEmail(String email) {
		System.out.println("*********display method********");
		try {
			if (email.contains("@") && email.length() >5){
				em.addEmaildetails(email);
			} else {
				throw new InvalidEmail("Invalid email");

			}
		} catch (InvalidEmail e) {
			System.out.println("Exception Occured ");
		}
		System.out.println("inside display method end");

	}

}
