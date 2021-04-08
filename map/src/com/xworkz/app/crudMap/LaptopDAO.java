package com.xworkz.app.crudMap;

public interface LaptopDAO {
	
	public void addLaptopDetails(long imei,LaptopDTO dto);
	
	public void displayUsingkey(long imei);
	
	public void updateLaptop(long imei,String ram);
	
	
	public void delete(long im);
	
	public void display();

}
