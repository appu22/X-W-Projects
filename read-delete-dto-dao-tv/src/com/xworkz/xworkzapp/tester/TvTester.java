package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dao.TvDao;
import com.xworkz.xworkzapp.dao.TvDaoImple;
import com.xworkz.xworkzapp.dto.TvDto;

public class TvTester {
	
	public static void main(String[] args) {
		
		TvDto dto = new TvDto(1230, "MI", "1220x1250",15999 , "MI12");
		
		
		TvDao dao = new TvDaoImple();//upcasting
		dao.addTvObject(dto);
		dao.displayTv();
		dao.update(1230, "10000"
				+ "MI");
		//dao.update(130, "12MI");
		dao.displayTv();
		
		dao.delete(1230);
		dao.displayTv();
			
		
	}

}
