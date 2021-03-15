package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.UserDetailsDto;

public class UserDetailsDaoImpl implements UserDetailsDao {
	UserDetailsDto dto[] = new UserDetailsDto[4];
	int index = 0;

	@Override
	public void addUserDetails(UserDetailsDto detailsDto) throws Throwable {
		if (index < 3) {
			dto[index] = detailsDto;
			index++;
			System.out.println("Register Successfull...!");
		} else {
			throw new Throwable("out bond exception");
		}
	}
}
