package com.xworkz.xworkzapp.customexception;

public class SizeOfArray extends RuntimeException{
	
	public SizeOfArray(String maxSize) {
		super(maxSize);
	}

}
