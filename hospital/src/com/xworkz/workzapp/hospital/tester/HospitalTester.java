package com.xworkz.workzapp.hospital.tester;

import com.xworkz.workzapp.hospital.dto.HospitalDto;
import com.xworkz.workzapp.hospital.service.HospitalServiceImpl;

public class HospitalTester {
	public static void main(String[] args) {
		HospitalDto dto = new HospitalDto("hos123", "appolo", "chennai", "sathya", "ortho", "7867895550");
		HospitalDto dto1 = new HospitalDto("esi321", "esihosp", "bnglr", "appu", "surgery", "8219262432");

		HospitalServiceImpl hos = new HospitalServiceImpl();

		hos.validateaddHospitalDao(dto);
		hos.validateaddHospitalDao(dto1);
		hos.displayHospitaldetails();
		hos.updteHospitalDetails("hos123", "bangalore");
		hos.displayHospitaldetails();
		hos.deleteHospitalDetails("appolo");
		hos.displayHospitaldetails();
		
		hos.showDetails("esi321", "esihosp");

	}

}
