package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.ForestDTO;

public class ForestTester {

	public static void main(String[] args) {
		
		ForestDTO dto = new ForestDTO();
		dto.setForestName("Bhandipur");
		dto.setForestSqlkm("100000km");
		dto.setForestType("Dry");
		
		System.out.println(dto.getForestName()+ " "+ dto.getForestSqlkm()+" "+dto.getForestType());

		ForestDTO dandeli = new ForestDTO();
		dandeli.setForestName("Dandeli");
		dandeli.setForestSqlkm("500000km");
		dandeli.setForestType("Green area");
		
		System.out.println(dandeli.getForestName()+ " "+ dandeli.getForestSqlkm()+" "+dandeli.getForestType());

	}
}
