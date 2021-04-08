package com.xworkz.app.crudMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LaptopDAOImple implements LaptopDAO {

	Map<Long, LaptopDTO> map = new HashMap<Long, LaptopDTO>();

	@Override
	public void addLaptopDetails(long imei, LaptopDTO dto) {
		map.put(imei, dto);
		System.out.println("Data Added Successfull.");

	}

	@Override
	public void displayUsingkey(long imei) {
		LaptopDTO laptopDTO = map.get(imei);
		System.out.println(laptopDTO);

	}

	@Override
	public void display() {
		Set<Entry<Long, LaptopDTO>> set = map.entrySet();
//		Iterator<Entry<Long, LaptopDTO>> iterator = set.iterator();

		for (Entry<Long, LaptopDTO> entry : set) {
			LaptopDTO value = entry.getValue();
			System.out.println("******************************************");
			System.out.println("Laptop Imei no : " + value.getImeiNo());
			System.out.println("Laptop Name    : " + value.getName());
			System.out.println("Laptop Price   : " + value.getPrice());
			System.out.println("Laptop Ram     : " + value.getRam());
			System.out.println("Laptop Color   : " + value.getColor());
			System.out.println("******************************************");

		}

	}

	@Override
	public void updateLaptop(long imei, String ram) {
		Set<Entry<Long, LaptopDTO>> entrySet = map.entrySet();
		for (Entry<Long, LaptopDTO> entry : entrySet) {

			LaptopDTO value = entry.getValue();
			if (imei == value.getImeiNo()) {
				value.setRam(ram);
				System.out.println("Upadate Successfull...." + value);
			} else {
				System.out.println("enter valid imei number");
			}

		}

	}

	@Override
	public void delete(long im) {
		
		map.remove(im);
		System.out.println("Delete Successfull...."+im);
		
	}

}
