package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.theater.Theater;

public class TheaterUtil {

	public static void main(String[] args) {
		
		Theater theater = new Theater("Navaranga", "Rajajinagar", 1500, 1, 4, true);
		theater.ticketIssue();
		theater.parkingCheck();
		theater.orderFood();
	}
}
