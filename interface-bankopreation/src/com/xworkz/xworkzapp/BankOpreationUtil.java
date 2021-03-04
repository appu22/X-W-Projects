package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.bankopreation.BankOpreation;
import com.xworkz.xworkzapp.bankopreation.Loan;
import com.xworkz.xworkzapp.bankopreation.Savings;

public class BankOpreationUtil {

	public static void main(String[] args) {
		System.out.println("-----------Loan Account -----------");
		BankOpreation loan = new Loan();
		System.out.println("---------Deposit ----------");
		loan.deposit(1200);
		System.out.println("---------Withdraw ----------");
		loan.withdraw(2000);
		
		System.out.println();
		System.out.println("**********Saving Account ************ ");
		BankOpreation savings = new Savings(); //upcasting
		System.out.println("********Deposit**********");
		savings.deposit(5000);
		System.out.println("********Withdraw**********");
		savings.withdraw(400);
	}
}
