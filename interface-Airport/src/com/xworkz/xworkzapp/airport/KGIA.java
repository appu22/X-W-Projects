package com.xworkz.xworkzapp.airport;

public class KGIA implements Airport {

	String airportName;
	int noOfRunWays;
	String id;

	public KGIA(String airportName, int noOfRunWays, String id) {
		super();
		this.airportName = airportName;
		this.noOfRunWays = noOfRunWays;
		this.id = id;
		System.out.println("Airport Name= " + airportName + " No Of RunWays= " + noOfRunWays + " id= " + id);
	}

	@Override
	public void seucrity() {
		System.out.println("Security checked ");
	}

	@Override
	public void id() {
		System.out.println("id checked");
	}

}
