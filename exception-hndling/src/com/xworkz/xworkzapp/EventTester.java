package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.exception.ExceptionEvent;

public class EventTester {

	public static void main(String[] args) throws Throwable {
		System.out.println(" start program ");

		ExceptionEvent exce = new ExceptionEvent();
//
//		System.out.println("calling event method by passing false");
//		exce.createEvent(false);
//		System.out.println("clling event method by pssing true ");
//		exce.createEvent(true);
		exce.phase1();
		System.out.println("End programmer");
	}
}
