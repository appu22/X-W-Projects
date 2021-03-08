package com.xwrokz.xworkzapp.service;

import com.xwrokz.xworkzapp.dto.StudentDto;

public interface StudentService {

	public void validateRegNumber(StudentDto dto);
	
	public void validateDisplay();
	
	public void validateUpdateStudentDetails(String regNo, String address);
	
	
	
	public void checkregnumber(String regNumber);
	
	
	public void deleteStudentDetails(String nm);
}
