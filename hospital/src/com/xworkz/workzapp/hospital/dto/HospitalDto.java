package com.xworkz.workzapp.hospital.dto;

public class HospitalDto {
	private String licence;
	private String name;
	private String location;
	private String founder;
	private String Specialized;
	private String phoneNo;
	
	
	public HospitalDto(String licence, String name, String location, String founder, String specialized, String phoneNo) {
		super();
		System.out.println("hospital dto call");
		this.licence = licence;
		this.name = name;
		this.location = location;
		this.founder = founder;
		Specialized = specialized;
		this.phoneNo = phoneNo;
	}


	public String getLicence() {
		return licence;
	}


	public void setLicence(String licence) {
		this.licence = licence;
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


	public String getFounder() {
		return founder;
	}


	public void setFounder(String founder) {
		this.founder = founder;
	}


	public String getSpecialized() {
		return Specialized;
	}


	public void setSpecialized(String specialized) {
		Specialized = specialized;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
	
	
	

}
