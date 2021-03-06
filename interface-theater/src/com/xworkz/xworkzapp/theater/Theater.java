package com.xworkz.xworkzapp.theater;

public class Theater extends TheaterBranch implements TheaterOpeartion{
	private String name;
	private String location;
	private int capcity;
	private int noOfScreen;
	private int noOfShow;
	private boolean isAc;
	
	public Theater() {
		System.out.println("hii i am deafult comstriuctor");
		
	}
	public Theater(String name, String location, int capcity, int noOfScreen, int noOfShow, boolean isAc) {
		//this();
		System.out.println("hii 2 nd ");
		this.name = name;
		this.location = location;
		this.capcity = capcity;
		this.noOfScreen = noOfScreen;
		this.noOfShow = noOfShow;
		this.isAc = isAc;
		System.out.println("");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapcity() {
		return capcity;
	}
	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}
	public int getNoOfScreen() {
		return noOfScreen;
	}
	public void setNoOfScreen(int noOfScreen) {
		this.noOfScreen = noOfScreen;
	}
	public int getNoOfShow() {
		return noOfShow;
	}
	public void setNoOfShow(int noOfShow) {
		this.noOfShow = noOfShow;
	}
	public boolean isAc() {
		return isAc;
	}
	public void setAc(boolean isAc) {
		this.isAc = isAc;
	}
	@Override
	public void ticketIssue() {
		System.out.println("Ticket Issued");
	}
	@Override
	public void parkingCheck() {
		System.out.println("Parking .......");
	}
	@Override
	public void orderFood() {
		System.out.println("Order food done. !! Thank you ");
	}
	
	
	
	
}
