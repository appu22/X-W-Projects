package com.xworkz.workzapp.hospital.service;

import com.xworkz.workzapp.hospital.dto.HospitalDto;

public interface HospitalService {
	
	public boolean validateaddHospitalDao(HospitalDto dto);
	
	public void displayHospitaldetails();
	
	public void updteHospitalDetails(String licene, String loc);
	
	
	public void deleteHospitalDetails(String nm);
	
	public void showDetails(String licence, String name1);

}
