package com.xworkz.xworkzapp.library;

public class Library {
	String name;
	int blockNo;
	
	{
		System.out.println("Hii i am instance initiliaztion block");
		this.read();
		
	}
	static
	{
		System.out.println("Hii i am static block");
		
	}
	
	public Library() {
		
		name="RCUB";
		blockNo=25;
		System.out.println(name);
		System.out.println(blockNo);
		System.out.println("hii i am constructor");
		
		}
	public void read()
	{
		//System.out.println("Reading books ");
		System.out.println(" i am method");
	}

}
