package com.xworkz.xwrokzapp;

import com.xworkz.xwrokzapp.fruits.Apple;
import com.xworkz.xwrokzapp.fruits.Fruits;
import com.xworkz.xwrokzapp.fruits.Mango;

public class FruitsUtil {

	public static void main(String[] args) {
		
		Fruits apple = new Apple();  //parent class changing its behaviour  
		//apple.types="Apple";    // child class obejct  
		apple.name="Apple";
		apple.toGaveEnergy();
		System.out.println("Fruit Name: "+apple.name+"Type: ");
		
		Fruits mango = new Mango();  //parent class Fruits changing its behaviour 
		//mango.types="";     // child class object
		mango.name="Mango";
		mango.toGaveEnergy();
		System.out.println("Fruit Name: "+mango.name);
		
		//Run time polymorp
	}

}
