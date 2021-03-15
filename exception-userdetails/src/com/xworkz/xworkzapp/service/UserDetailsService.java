package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.UserDetailsDto;

public interface UserDetailsService {
	
	public void validateDetails(UserDetailsDto dto) throws Throwable;

}
