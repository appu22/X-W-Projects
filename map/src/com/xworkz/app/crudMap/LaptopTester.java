package com.xworkz.app.crudMap;

import java.util.HashMap;
import java.util.Map;

public class LaptopTester {

	public static void main(String[] args) {

		LaptopDTO hp = new LaptopDTO(1243543l, "HP", 12999, "red", "4GB", "500GB");

		LaptopDTO dell = new LaptopDTO(4565465l, "HP", 15999, "black", "2GB", "2TB");

		LaptopDTO lenovo = new LaptopDTO(74589l, "HP", 20000, "skyblue", "3GB", "320GB");

		LaptopDTO acer = new LaptopDTO(15945l, "ACER", 25000, "white", "8GB", "1TB");

		LaptopDAO dao = new LaptopDAOImple();
		dao.addLaptopDetails(hp.getImeiNo(), hp);
		dao.addLaptopDetails(acer.getImeiNo(), acer);
		dao.addLaptopDetails(dell.getImeiNo(), dell);
		dao.addLaptopDetails(lenovo.getImeiNo(), lenovo);

		dao.display();
		dao.displayUsingkey(hp.getImeiNo());
		dao.display();
		dao.updateLaptop(1243543l, "5gbRam");
		dao.display();
		dao.delete(74589l);
		dao.display();

	}

}
