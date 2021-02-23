package com.xworkz.xworkzapp;

import java.awt.image.BandCombineOp;

import com.xworkz.xworkzapp.bank.BandhanBank;
import com.xworkz.xworkzapp.bank.Bank;
import com.xworkz.xworkzapp.bank.Denabank;
import com.xworkz.xworkzapp.bank.HdfcBank;
import com.xworkz.xworkzapp.bank.IciciBank;

public class BankUtil {

	public static void main(String[] args) {
		
	
		Bank bank = new HdfcBank();
		bank.rateOfInterest();
		Bank bank2 = new IciciBank();
		bank2.rateOfInterest();
		Bank denabank = new Denabank();
		denabank.rateOfInterest();
		Bank bandhanBank = new BandhanBank();
		bandhanBank.rateOfInterest();
		
		
	}
}
