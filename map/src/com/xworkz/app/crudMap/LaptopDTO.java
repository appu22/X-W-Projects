package com.xworkz.app.crudMap;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class LaptopDTO {

	@NonNull
	private long imeiNo;
	@NonNull
	private String name;
	@NonNull
	private int price;
	@NonNull
	private String color;
	@NonNull
	private String ram;
	@NonNull
	private String hdd;

	@Override
	public String toString() {
		return "LaptopDTO [imeiNo=" + imeiNo + ", name=" + name + ", price=" + price + ", color=" + color + ", ram="
				+ ram + ", hdd=" + hdd + "]";
	}


	
}
