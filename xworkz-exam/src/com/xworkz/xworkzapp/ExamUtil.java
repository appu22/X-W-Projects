package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.exam.Exam;
import com.xworkz.xworkzapp.exam.Hallticket;
import com.xworkz.xworkzapp.exam.SupplementoryExam;

public class ExamUtil {

	public static void main(String[] args) {

		//Exam exam = new Exam();
		//exam.fees = 1600;

		Hallticket hallticket = new Hallticket("JAVA05", "cs181005", "APPU");
		//hallticket.displayInfo();
		//exam.allow(hallticket);
		
		Exam exam2 = new SupplementoryExam();
		exam2.allow(hallticket);
		
	}
}
