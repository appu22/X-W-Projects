package com.xworkz.xworkzapp.calci;

//child class or derived class sub class
public class Scientific extends Calculator {
	
	String name;
	int price;
	
	public Scientific(String calName,int rs) {
		name=calName;
		price=rs;
		System.out.println("i am constructor "+calName+"Price "+rs);		
	}
	
	public void sub(int a,int b) {
		
		int c=a-b;
		System.out.println("\n hi i am child or derived or sub class ");
		System.out.println("Substracting two numbers "+ c);
	}
	

}
