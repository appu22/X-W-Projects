package com.xworkz.xworkzapp.bankopreation;

public class Savings implements BankOpreation {

	@Override
	public int withdraw(int amount) {
		int saving = 1000;
		System.out.println("Savimg amount is : " + saving);
		saving = saving - amount;
		System.out.println("Withdraw Amount is " + amount + "\nwithdraw successfully...! ");
		System.out.println("Balance  amount is : " + saving);

		return saving;
	}

	@Override
	public int deposit(int amount) {
		int saving = 1000;
		System.out.println("Old  Balance : " + saving);
		System.out.println("Deposit amount " + amount);
		saving = saving + amount;
		System.out.println("Deposit amount + Old Amount : " + saving);
		return saving;
	}

}
