package com.xworkz.xworkzapp.bankopreation;

public class Loan implements BankOpreation {
	@Override
	public int withdraw(int amount) {
		int wd = 10000;
		System.out.println("Your Loan is : " + wd );
		System.out.println("Withdraw amount : "+amount+"\nwithdraw successfully..!");
		wd = wd - amount;
		System.out.println("Balance is : " + wd);
		return wd;
	}

	@Override
	public int deposit(int amount) {
		int dp = 300;
		System.out.println("Old Amount is : " + dp);
		System.out.println("Your Deposit is : " + amount);
		dp = dp + amount;
		System.out.println("Total Balance is : " + dp);
		return dp;
	}

}
