package com.xworkz.xworkzapp.exam;

public class Hallticket {

	public String subjectcode;
	public String usn;
	public String candidateName;

	public Hallticket(String subjectcode, String usn, String candidateName) {
		super();
		this.subjectcode = subjectcode;
		this.candidateName = candidateName;
		this.usn = usn;
		this.displayInfo();
		

	}

	public void displayInfo() {
		System.out.println("subjectcode " + this.subjectcode + " Candiddate Name: " + this.candidateName + " University name " + this.usn);
		System.out.println("");
	}

	public String getCandidateName() {
		return candidateName;
	}

	public String getUsn() {
		return usn;
	}

	public String getsubjectcode() {
		return subjectcode;
	}
}
