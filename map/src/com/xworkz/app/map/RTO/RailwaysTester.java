package com.xworkz.app.map.RTO;

import java.util.HashMap;

public class RailwaysTester {
	
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "Hubbali Station ");
		map.put(22, "Belagavi");
		map.put(38, "Bidar");
		map.put(50, "Koramangal");
		map.put(32, "Gulbarga");
		//add dto int 
		//set dto int 
		
		System.out.println("Printing all value : "+map);
		System.out.println("Size of map		   : "+map.size());
		map.put(55, "Gulbarga");
		System.out.println("Size of map 	   : "+map.size());
		
		String s = map.get(38);
		System.out.println(s);
		
		System.out.println("Passing Key : "+map.containsKey(22));
		
		System.out.println("VAlue  :  "+map.containsValue("bidar"));
		
		System.out.println("Checking object is empty : "+map.isEmpty());
		
		
		
		
		
		
		
		
		
		
	}

}
