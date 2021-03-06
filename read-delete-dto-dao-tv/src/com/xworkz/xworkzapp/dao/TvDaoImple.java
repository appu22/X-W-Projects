package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.TvDto;

public class TvDaoImple implements TvDao {

	TvDto dto[] = new TvDto[2];

	@Override
	public void addTvObject(TvDto dto) {
		this.dto[0] = dto;
		System.out.println("Tv Added Successfully..!");

		// System.out.println("imeiNo "+dto.getImeiNo()+" brand "+dto.getBrand()+"
		// resolution "+ dto.getResolution()+"price"+ dto.getPrice()+ " model
		// "+dto.getModel() );
	}

	@Override
	public void displayTv() {
		if (dto[0] != null) {

			for (int i = 0; i < dto.length; i++) {
				System.out.println("Brand name is " + this.dto[0].getBrand());
				System.out.println("Imei Number " + this.dto[0].getImeiNo());
				System.out.println("Model " + this.dto[0].getModel());
				System.out.println("Price " + this.dto[0].getPrice());
				System.out.println("Resolution " + this.dto[0].getResolution());

			}
		}
	}

	@Override
	public void update(int imeiNo, String newmodel) {
		System.out.println("value updated ");
		if (dto[0].getImeiNo() == imeiNo) {
			dto[0].setModel(newmodel);

		} else {
			System.out.println("You entered wrong imei number.. plese check imei  ");
		}
	}

	@Override
	public void delete(int imeiNo) {
		System.out.println("i am delete method");
		if (dto[0].getImeiNo() == imeiNo) {
			dto[0] = null;
			System.out.println("All Recods Deleted .....! ");

		} else {
			System.out.println("Entered wrong imei number");

		}

	}

}
