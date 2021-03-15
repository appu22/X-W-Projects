package com.xworkz.xworkzapp.dto;

public class UserDetailsDto {

	private String name;
	private String email;
	private long phoneNumber;
	private String address;
	private String adharCard;
	
	
	
	public UserDetailsDto(String name, String email, long phoneNumber, String address, String adharCard) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.adharCard = adharCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	



}
