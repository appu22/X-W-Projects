package com.xworkz.app.map.RTO;

import com.xworkz.app.map.RTO.dao.RtoDAO;
import com.xworkz.app.map.RTO.dao.RtoDAOImple;
import com.xworkz.app.map.RTO.dto.RtoDTO;

public class RtoTester {

	public static void main(String[] args) {
		System.out.println("Program start");

		RtoDTO dto = new RtoDTO(38, "bidar", 4);
		RtoDTO dto1 = new RtoDTO(22, "belagavi", 12);
		RtoDTO dto2 = new RtoDTO(23, "chikodi", 5);
		RtoDTO dto3 = new RtoDTO(30, "jamkhandi", 10);

		RtoDAO dao = new RtoDAOImple();

		dao.addRtodetails(1, dto);
		dao.addRtodetails(2, dto1);
		dao.addRtodetails(3, dto2);
		dao.addRtodetails(4, dto3);

		dao.get(3);
//		dao.get(23);

		System.out.println("Program end");

	}

}
