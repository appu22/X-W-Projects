package com.xworkz.xworkzapp.hospital;

public class GovernmentHospital extends Hospital {
	@Override
	public boolean allow(Doctors doctors) {
		System.out.println("Invoked govermentHospital ");
		super.eductaion = "MBBS";
		return super.allow(doctors);

	}

}
