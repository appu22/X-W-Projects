package com.xworkz.xworkzapp.dto;

public class AmazonDto {

	private String userName;
	private String password;
	private String movieName;
	private String size;
	private String actor;
	private String actress;

	public AmazonDto(String userName, String password, String movieName, String size, String actor, String actoress) {
		super();
		this.userName = userName;
		this.password = password;
		this.movieName = movieName;
		this.size = size;
		this.actor = actor;
		this.actress = actoress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActoress() {
		return actress;
	}

	public void setActoress(String actoress) {
		this.actress = actoress;
	}

}
