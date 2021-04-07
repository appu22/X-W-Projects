package com.xworkz.xworkzapp.map.RTO.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class RtoDTO {

	@NonNull
	private int rtoID;
	@NonNull
	private String location;
	@NonNull
	private int noOfOfficers;

	
	
}
