package com.xworkz.workzapp.hospital.dao;

import com.xworkz.workzapp.hospital.dto.HospitalDto;

public interface HospitalDao {
	
	public void addHospitalDao(HospitalDto dto);
	public void displayHospitalDetails();
	
	public void updteHospitalDetails(String licene, String loc);
	
	public void deleteHospitalDetails(String nm);
	
	public void showDetails(String licene, String name);
	 

}
