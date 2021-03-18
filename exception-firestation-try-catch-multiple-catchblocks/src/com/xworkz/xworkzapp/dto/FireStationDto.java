package com.xworkz.xworkzapp.dto;

public class FireStationDto {
	private String stationId;
	private String fireStationname;
	private int noOfEngines;
	private String location;
	private int noOfStation;
	private String vehicles;
	private long helpLineNo;
	
	public FireStationDto() {
		System.out.println("Fire Station Constructor");
	}
	
	
	public FireStationDto(String stationId, String fireStationname, int noOfEngines, String location, int noOfStation,
			String vehicles, long helpLineNo) {
		super();
		this.stationId = stationId;
		this.fireStationname = fireStationname;
		this.noOfEngines = noOfEngines;
		this.location = location;
		this.noOfStation = noOfStation;
		this.vehicles = vehicles;
		this.helpLineNo = helpLineNo;
	}


	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getFireStationname() {
		return fireStationname;
	}
	public void setFireStationname(String fireStationname) {
		this.fireStationname = fireStationname;
	}
	public int getnoOfEngines() {
		return noOfEngines;
	}
	public void setNoOfEmployers(int noOfEngines) {
		this.noOfEngines = noOfEngines;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfStation() {
		return noOfStation;
	}
	public void setNoOfStation(int noOfStation) {
		this.noOfStation = noOfStation;
	}
	public String getVehicles() {
		return vehicles;
	}
	public void setVehicles(String vehicles) {
		this.vehicles = vehicles;
	}
	public long getHelpLineNo() {
		return helpLineNo;
	}
	public void setHelpLineNo(long helpLineNo) {
		this.helpLineNo = helpLineNo;
	}

	
}
