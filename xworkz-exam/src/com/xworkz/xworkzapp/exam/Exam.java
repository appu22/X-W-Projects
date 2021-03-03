package com.xworkz.xworkzapp.exam;

public class Exam {

	public int fees;
	public Hallticket hallticket;

	public boolean allow(Hallticket hallticket) {
		boolean check = false;
		if (this.fees == 1600) {
			check = true;
			if (hallticket != null) {

				this.hallticket = hallticket;
				System.out.println("Allowed to write exam");
			} else {
				System.out.println("Hall ticket is not yet generated");
			}

		} else {
			System.out.println("Please pay the fees");
		}
		return check;
	}
}
