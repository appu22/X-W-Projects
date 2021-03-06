package com.xworkz.xworkzapp.dto;

public class TvDto {
	
	private int imeiNo;
	private String brand;
	private String resolution;
	private int price;
	private String model;
	public TvDto(int imeiNo, String brand, String resolution, int price, String model) {
		super();
		System.out.println("Tv Dto object created ");
		this.imeiNo = imeiNo;
		this.brand = brand;
		this.resolution = resolution;
		this.price = price;
		this.model = model;
	}
	public int getImeiNo() {
		return imeiNo;
	}
	public void setImeiNo(int imeiNo) {
		this.imeiNo = imeiNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}
