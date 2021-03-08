package com.xwrokz.xworkzapp.dao;

import com.xwrokz.xworkzapp.dto.StudentDto;

public class StudentDaoImple implements StudentDao {

	StudentDto studdto[] = new StudentDto[3];
	int index = 0;

	@Override
	public void addStudentDetails(StudentDto dto) {
		studdto[index] = dto;
		index++;
		System.out.println("Add student Details method");

	}

	@Override
	public void displayStudentDetails() {
		System.out.println("Display method");
		for (int i = 0; i < index; i++) {
			if (studdto[i] != null) {
				System.out.println("Student Name is      : " + studdto[i].getName());
				System.out.println("Student Register  No : " + studdto[i].getRegNumber());
				System.out.println("Student Address	     : " + studdto[i].getAddress());
				System.out.println("Student Phone number : " + studdto[i].getPhoneNumber() + "\n");
			} else {
				System.out.println(" invalid register ");
			}
		}

	}

	@Override
	public void updateStudentDetails(String regNo, String address) {
		System.out.println("update method ");
		for (int i = 0; i < index; i++) {
			if (studdto[i].getRegNumber().equals(regNo)) {
				studdto[i].setAddress(address);

			}

		}
	}

	@Override
	public void displayStudentDetails(String regNumber ) {
		for (int i = 0; i < index; i++) {
			
			if (studdto[i].getRegNumber()==regNumber)
			{
				System.out.println("Student Name is      : " + studdto[i].getName());
				System.out.println("Student Register  No : " + studdto[i].getRegNumber());
				System.out.println("Student Address	     : " + studdto[i].getAddress());
				System.out.println("Student Phone number : " + studdto[i].getPhoneNumber() + "\n");
			} else {
				
				System.out.println(" **invalid  register ");
			}

		}

	}

	@Override
	public void deleteStudentDetails(String nm) {
		System.out.println("i am delete method");
		for (int i = 0; i < index; i++) {
			
			if (studdto[i].getName()==nm) {
				studdto[i] = null;
					System.out.println("entered  Recods Deleted .....! ");

	
			} else {
				System.out.println(" Entered wrong name ");
	
			}
		}
	}
}
