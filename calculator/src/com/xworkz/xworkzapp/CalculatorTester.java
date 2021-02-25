package com.xworkz.xworkzapp;

//import com.xworkz.xworkzapp.calci.Calculator;
import com.xworkz.xworkzapp.calci.Scientific;
public class CalculatorTester {
	public static void main(String[] args) {
		Scientific scientific = new Scientific("Casio - ", 45);
		scientific.add(2, 8);
		scientific.sub(3, 2);
		// Calculator calculator = new Calculator();
		// calculator.add(2, 5);
	}

}
