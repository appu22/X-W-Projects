package com.xwrokz.xworkzapp.dto;

public class StudentDto {

	private String name;
	private String regNumber;
	private long phoneNumber;
	private String address;
	public StudentDto(String name, String regNumber, long phoneNumber, String address) {
		super();
		this.name = name;
		this.regNumber = regNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
}
