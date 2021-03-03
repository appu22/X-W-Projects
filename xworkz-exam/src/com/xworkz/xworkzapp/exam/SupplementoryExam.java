package com.xworkz.xworkzapp.exam;

public class SupplementoryExam extends Exam{

	@Override
	public boolean allow(Hallticket ticket) {
		System.out.println("Invoked ");
		super.fees=1500;
		return super.allow(ticket);
		
	}
	
}
