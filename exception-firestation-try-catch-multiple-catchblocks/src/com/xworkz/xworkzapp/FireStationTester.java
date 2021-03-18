package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.FireStationDto;
import com.xworkz.xworkzapp.service.FireStationService;
import com.xworkz.xworkzapp.service.FireStationServiceImple;

public class FireStationTester {

	public static void main(String[] args) {
		System.out.println("program start");
		
		FireStationDto dto = new FireStationDto("FIRd001","RajajinagarFireStation"
				,1,"Rajajinagar",6,"Engines 5",12345l);
		
		FireStationService serviceImple = new FireStationServiceImple();
		
		serviceImple.validateFireStation(dto);
		
		System.out.println("program ends");
	}
}