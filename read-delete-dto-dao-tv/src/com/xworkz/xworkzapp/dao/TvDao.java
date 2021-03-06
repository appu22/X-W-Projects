package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.TvDto;

public interface  TvDao {
	
	public void addTvObject(TvDto dto);
	public void displayTv();
	public void update(int imeiNo ,String model);
	public void delete(int imeiNo);

}
