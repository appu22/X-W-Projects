package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.hospital.Doctors;
import com.xworkz.xworkzapp.hospital.GovernmentHospital;
import com.xworkz.xworkzapp.hospital.Hospital;

public class HospitalUtil {

	public static void main(String[] args) {
		Doctors doctor = new Doctors("Sushant", "Surgery", 10);

		Hospital hospital = new GovernmentHospital();
		hospital.allow(doctor);

	}

}
