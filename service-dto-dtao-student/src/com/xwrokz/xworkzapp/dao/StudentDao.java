package com.xwrokz.xworkzapp.dao;

import com.xwrokz.xworkzapp.dto.StudentDto;

public interface StudentDao {
	
	public void addStudentDetails(StudentDto dto);
	
	public void displayStudentDetails();
	
	public void updateStudentDetails(String regNo, String address);
	
	public void displayStudentDetails(String regNumber);
	
	
	public void deleteStudentDetails(String nm);
	
	

}
