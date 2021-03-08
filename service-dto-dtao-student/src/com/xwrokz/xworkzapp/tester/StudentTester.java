package com.xwrokz.xworkzapp.tester;

import com.xwrokz.xworkzapp.dto.StudentDto;
import com.xwrokz.xworkzapp.service.StudSerivceImple;
import com.xwrokz.xworkzapp.service.StudentService;


public class StudentTester {

	public static void main(String[] args) {
		
		StudentDto dto = new StudentDto("Appu", "CS181005", 8217237037l, "Belgavai");
		
		StudentDto dto1 = new StudentDto("kiran", "CS181009", 9986695340l, "Athani");
		
		StudentService imple = new StudSerivceImple();
		
		imple.validateRegNumber(dto);
		imple.validateRegNumber(dto1);
		imple.validateDisplay();
		
		imple.validateUpdateStudentDetails("CS181009","harugeri");
		imple.validateDisplay();
		
		imple.checkregnumber("CS181005");
	
		
		
		imple.deleteStudentDetails("Appu");
		imple.validateDisplay();
		
		
	}
}
