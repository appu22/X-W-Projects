package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.HighwayDTO;

public class HighwayTester {

	public static void main(String[] args) {
		
		HighwayDTO dto = new HighwayDTO();
		dto.setHighwayName("NH4");
		dto.setDistance(500);
		dto.setNoOflane("four");
		
		System.out.println(dto.getDistance()+"km "+ dto.getHighwayName()+" "+ dto.getNoOflane());

	}

}

