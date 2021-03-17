package com.xworkz.xworkzapp;

public class EmailFactTester {

	public static void main(String[] args) {
		
		FactoryEmail emailFactory = new FactoryEmail();
		System.out.println("Program Start");
		emailFactory.addFact("a@");
		emailFactory.addFact("b@gmail.com");
		emailFactory.addFact("c@gmail.com");
		emailFactory.addFact("d@gmail.com");
		emailFactory.addFact("e@gmail.com");
		emailFactory.addFact("f@gmail.com");
		System.out.println("Program End");
	}
}
