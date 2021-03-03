package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.abstract1.SBIBank;
import com.xworkz.xworkzapp.abstract1.interstRate;

public class AtmUtil {

	public static void main(String[] args) {
		
		interstRate bank = new SBIBank();
		System.out.println("Bike Loan is "+bank.getBikeloan());
		System.out.println("Home Loan is  "+bank.getHomeloan());
		System.out.println("Personal Loan is "+bank.getPersonalloan());
		
		
		Atm atm = new Atm();
		atm.setBankCode(125);
		atm.setBranchName("ICICI");
		atm.setLocation("Belagavi");
		System.out.println("Branch Name "+atm.getBranchName());
		System.out.println("Bank Code "+atm.getBankCode());
		System.out.println("Location "+atm.getLocation());
		
	}
}
