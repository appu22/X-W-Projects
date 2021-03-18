package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.customException.InvalidFireID;
import com.xworkz.xworkzapp.customException.MinLimitNotMatchingException;
import com.xworkz.xworkzapp.dto.FireStationDto;

public class FireStationServiceImple implements FireStationService {

	public FireStationServiceImple() {
		System.out.println("Inside service impl");
	}

	@Override
	public void validateFireStation(FireStationDto dto) {
		System.out.println("Inside the fire station validate ");
		try {
			if (dto.getStationId() == null || !dto.getStationId().contains("FIR")) {
				throw new InvalidFireID("Invalid Id");
			}
			if (dto.getnoOfEngines() < 3) {
				throw new MinLimitNotMatchingException("Number of Engnies 5");
			}
			//child Exception
		} catch (MinLimitNotMatchingException e) {
			System.out.println("Exception during firestation no Of Engines validate ");
		}
		//child Exception
		catch (InvalidFireID e) {
			System.out.println("Exception during firestation id validate");
		}
		catch (Exception e) { //parent class of all the runtime EXception
		}
		System.out.println("Exception ends");

	}

}
