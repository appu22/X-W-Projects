package com.xwrokz.xworkzapp.service;

import com.xwrokz.xworkzapp.dao.StudentDaoImple;
import com.xwrokz.xworkzapp.dto.StudentDto;

public class StudSerivceImple implements StudentService {

	StudentDaoImple imple = new StudentDaoImple();

	@Override
	public void validateRegNumber(StudentDto dto) {
		System.out.println("inside student add serviceimpl method ");
		if (dto.getRegNumber() != null) {
			imple.addStudentDetails(dto);
		} else {
			System.out.println("enter valid register number");
		}

	}

	@Override
	public void validateDisplay() {
		System.out.println("inside student display serviceimpl method ");
		imple.displayStudentDetails();

	}

	@Override
	public void validateUpdateStudentDetails(String regNo, String address) {
		System.out.println("inside serviceimple  update method");
		if (regNo != null) {
			imple.updateStudentDetails(regNo, address);
		} else {
			System.out.println("enter valid Register number");
		}

	}

	@Override
	public void checkregnumber(String regNumber) {

		if (regNumber != null) {
			System.out.println(" checked number Studentimple  ");
			imple.displayStudentDetails(regNumber);

		} else {
			System.out.println("invalid regisiter number  ");
		}

	}

	@Override
	public void deleteStudentDetails(String nm) {
		
		if (nm != null) {
			imple.deleteStudentDetails(nm);
			
			
		}else {
			System.out.println("invalid name  ");
			
		
		}
	}

}
