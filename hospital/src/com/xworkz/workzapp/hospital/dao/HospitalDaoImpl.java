package com.xworkz.workzapp.hospital.dao;

import com.xworkz.workzapp.hospital.dto.HospitalDto;

public class HospitalDaoImpl implements HospitalDao {

	HospitalDto hosdto[] = new HospitalDto[2];
	int index = 0;

	@Override
	public void addHospitalDao(HospitalDto dto) {
		hosdto[index] = dto;
		index++;
		System.out.println(" added successfully....");

	}

	@Override
	public void displayHospitalDetails() {
		for (int i = 0; i < index; i++) {
			if (hosdto[i] != null) {
				System.out.println("licence number : " + hosdto[i].getLicence());
				System.out.println("Hospital Name  	: " + hosdto[i].getName());
				System.out.println("Hospital Location  : " + hosdto[i].getLocation());
			}
		}
	}

	@Override
	public void updteHospitalDetails(String licene, String loc) {
		for (int i = 0; i < index; i++) {

			if (hosdto[i].getLicence().equals(licene)) {
				hosdto[i].setLocation(loc);
				System.out.println("Update successfull...!");
			} else {
				System.out.println("invalid licence number");
			}

		}
	}

	@Override
	public void deleteHospitalDetails(String nm) {
		for (int i = 0; i < index; i++) {

			if (hosdto[i].getName().equals(nm)) {
				hosdto[i] = null;

				System.out.println("delete successfull...!");
			} else {
				System.out.println("invalid name");
			}
		}
	}

	@Override
	public void showDetails(String licene, String name) {
		System.out.println("passing 2 parameters ");
		for (int i = 0; i < index; i++) {
			if(hosdto[i]!=null) {
			if (hosdto[i].getLicence().equals(licene) && hosdto[i].getName().equals(name) ) {
				System.out.println("licence number : " + hosdto[i].getLicence());
				System.out.println("Hospital Name  	: " + hosdto[i].getName());
				System.out.println("Hospital Location  : " + hosdto[i].getLocation());
			}else {
				System.out.println("plzz enter valid input");
			}
			
		}
		}
	}
}
