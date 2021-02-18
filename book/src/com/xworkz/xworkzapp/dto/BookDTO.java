package com.xworkz.xworkzapp.dto;
public class BookDTO {

	private String bookName;
	private String bookAuthor;
	private int bookPages;
	private double price;
	
	public BookDTO(){
		System.out.print("Object is created");
		
	}
	public void setBookName(String name)
	{
		bookName=name;		
	}
	public String getBookName()
	{
		return bookName;
	}
	public void setBookAuthor(String author)
	{
		bookAuthor=author;
	}
	public String getBookAuthor()
	{
		return bookAuthor;
	}
	public void setBookPages(int pages)
	{
		bookPages=pages;
	}
	public int getBokkPages()
	{
		return bookPages;
	}
	public void setPrice(double rs)
	{
		 price=rs;
	}
	public double getPrice()
	{
		return price;
	}
	public void getKnowledge()
	{
		System.out.println("  To get knowledge");
	}	
}
