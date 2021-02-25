package com.xworkz.xworkzapp.library;

public class Library {
	String name;
	String studName;
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
		
		name="Rani Channamma University Belagavi.";
		studName="Appu Badiger ";
		System.out.println(name);
		System.out.println(studName);
		System.out.println("hii i am constructor");
		
		}
	public void read()
	{
		blockNo=25;
		//System.out.println("Reading books ");
		System.out.println("Block Number :"+blockNo);
	}

}
