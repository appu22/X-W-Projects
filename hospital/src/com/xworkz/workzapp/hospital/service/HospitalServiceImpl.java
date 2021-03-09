package com.xworkz.workzapp.hospital.service;

import com.xworkz.workzapp.hospital.dao.HospitalDaoImpl;
import com.xworkz.workzapp.hospital.dto.HospitalDto;

public class HospitalServiceImpl implements HospitalService {

	HospitalDaoImpl impl = new HospitalDaoImpl();

	@Override
	public boolean validateaddHospitalDao(HospitalDto dto) {
		boolean check = true;
		if (dto.getLicence() == null && dto.getLicence().length() != 8) {
			check = false;
			return check;
		}
		if (dto.getName() == null && dto.getName().length() < 4) {
			check = false;
			return check;

		}

		if (dto.getFounder() == null && dto.getFounder().length() < 6) {
			check = false;
			return check;
		}
		if(dto.getSpecialized()== null && dto.getSpecialized().length()<7) {
			check = false;
			return check;
		}if(check)
		{
			impl.addHospitalDao(dto);
		}
		return check;
		

	}

	@Override
	public void displayHospitaldetails() {
		System.out.println("Display Hospital Details serviceimpl");
		impl.displayHospitalDetails();
	}

	@Override
	public void updteHospitalDetails(String licene, String loc) {
		System.out.println("Update the details");
		if (licene != null)
			impl.updteHospitalDetails(licene, loc);
	}

	@Override
	public void deleteHospitalDetails(String nm) {
		if (nm != null) {
			impl.deleteHospitalDetails(nm);
		} else {
			System.out.println("invalid method");

		}
	}

	@Override
	public void showDetails(String licence, String name1) {
		if (licence != null) {
			impl.showDetails(licence, name1);

		}
	}

}
