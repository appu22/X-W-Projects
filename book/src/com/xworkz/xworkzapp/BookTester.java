package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.BookDTO;

public class BookTester {

	public static void main(String[] args) {
		
		BookDTO bookDTO = new BookDTO();
		bookDTO.getKnowledge();
		
		bookDTO.setBookAuthor("E Balaguruswmy");
		bookDTO.setBookName("JAVA 4th Edition");
		bookDTO.setBookPages(454);
		bookDTO.setPrice(450.50);
		System.out.println("Booke Name: "+bookDTO.getBookName()+" \n Book Author: "+bookDTO.getBookAuthor()+"\n Book Price:  "+
		bookDTO.getPrice()+" \nBook Pages: "+bookDTO.getBokkPages());
		

	}

}
