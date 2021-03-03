package com.xworkz.xworkzapp.hospital;

public class Hospital {

	public String eductaion;
	public Doctors doctor;

	public boolean allow(Doctors doctor) {
		boolean paid = false;
		if ( this.eductaion == "MBBS") {
			paid = true;
			System.out.println("From Child " + doctor);
			System.out.println("From Parent " + this.doctor);
			this.doctor = doctor;
			System.out.println("From parent 2 " + this.doctor);
			if (doctor != null) {
				System.out.println("Your eligiable for Doctor");
			} else {
				System.out.println(" Pursuing...  ");
			}
		} else {
			System.out.println("Please complete the course ");
		}
		return paid;
	}

}
