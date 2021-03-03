package com.xworkz.xworkzapp.abstract1;

public abstract class interstRate {

		int Bankcode;
		static int BranchCode;
		public	abstract double getHomeloan();
		public	abstract double getPersonalloan();
		public	abstract double getBikeloan();
		
		public int EducationLoan()
		{
			return 10;
		}
		
		public static void test() {
			System.out.println(" Hi im static method");
			
		}
}
