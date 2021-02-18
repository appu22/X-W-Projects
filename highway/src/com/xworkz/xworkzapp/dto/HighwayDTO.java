package com.xworkz.xworkzapp.dto;

public class HighwayDTO {

	private String highwayName;
	private String noOflane;
	private int distance;
	
	public String getHighwayName() {
		return highwayName;
	}
	public void setHighwayName(String name) {
		highwayName = name;
	}
	public String getNoOflane() {
		return noOflane;
	}
	public void setNoOflane(String lane) {
		noOflane = lane;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int dist) {
		distance = dist;
	}
}
