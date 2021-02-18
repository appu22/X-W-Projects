package com.xworkz.xworkzapp.dto;
 

public class ForestDTO
{		
	
	private String forestName;
	private String forestType;
	private String forestSqkm;
	 
	public ForestDTO()
	{
		System.out.println("object is created");
	}
	public String  getForestName()
	{
		return forestName;
	}
		public void  setForestName(String name)
		{
			forestName = name;
		}
		
		public void setForestType(String type)
		{
			forestType = type;
		}
		public String getForestType()
		{
			return forestType;
		}
		public void  setForestSqlkm(String sqkm)
		{
			forestSqkm=sqkm;
		}
		public String getForestSqlkm()
		{
			return forestSqkm;
		}
}

