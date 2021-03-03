package com.xworkz.xworkzapp.hospital;

public class Doctors {
	public String name;
	public String specificationIn;
	public int noOfYearsExperienced;

	public Doctors(String name, String specificationIn, int noOfYearsExperienced) {
		super();
		this.name = name;
		this.specificationIn = specificationIn;
		this.noOfYearsExperienced = noOfYearsExperienced;
		this.displayInfo();

	}

	public String getName() {
		return name;
	}

	public String getSpecificationIn() {
		return specificationIn;
	}

	public int getNoOfYearsExperienced() {
		return noOfYearsExperienced;
	}

	public void displayInfo() {
		System.out.println("Doctor Name is  " + this.name + "  Specialized in : " + this.specificationIn
				+ " No of Expperience is " + this.noOfYearsExperienced);
		System.out.println("");
	}

}
