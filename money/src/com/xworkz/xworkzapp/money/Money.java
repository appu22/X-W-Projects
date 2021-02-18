package com.xworkz.xworkzapp.money;

public class Money {

	public String searialNo;
	public String type;
	public static final int NO_OF_LANGUAGES =15;
	
	public Money(){
		System.out.println("Money obejct is created with 0 parameter");
	}
	public Money(String searialNo) {
		this();
		System.out.println("Money object is created with 1 parameter");
		this.searialNo=searialNo;
		//this.spend();
	}
	public Money(String searialNo,String type) {
		this(searialNo);
		System.out.println("Money object is created with 2 parameter");
		this.searialNo=searialNo;
		this.type=type;
		this.spend(type); 
	}
	public void spend()
	{
		System.out.println("Spending money on mom");
	}
	public void spend(String type)
	{
		 System.out.println("Spending money on mom "+ type);
	}
}
