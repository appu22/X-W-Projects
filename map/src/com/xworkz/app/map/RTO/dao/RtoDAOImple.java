package com.xworkz.xworkzapp.map.RTO.dao;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.xworkzapp.map.RTO.dto.RtoDTO;

public class RtoDAOImple implements RtoDAO {

	Map<Integer, RtoDTO> map = new HashMap<Integer, RtoDTO>();

	@Override
	public void addRtodetails(int k, RtoDTO dto) {
		map.put(k, dto);
		System.out.println("Added Succssfull....! ");

	} 

	@Override
	public void get(int k) {
		RtoDTO rtoDTO = map.get(k);
		System.out.println(rtoDTO);
	}

}
