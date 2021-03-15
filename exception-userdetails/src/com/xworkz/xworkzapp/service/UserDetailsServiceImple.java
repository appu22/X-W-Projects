package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.UserDetailsDao;
import com.xworkz.xworkzapp.dao.UserDetailsDaoImpl;
import com.xworkz.xworkzapp.dto.UserDetailsDto;

public class UserDetailsServiceImple implements UserDetailsService {

	UserDetailsDao dao = new UserDetailsDaoImpl();
	
	@Override
	public void validateDetails(UserDetailsDto dto) throws Throwable {
		if(dto.getEmail().contains("@")) {
			dao.addUserDetails(dto);
		}else
		{
			throw new Throwable("Please Enter Valid Data");
		}
	}

}
