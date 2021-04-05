package com.xwork.xworkzapp.compare;

public class BooksTester {

	public static void main(String[] args) {
		System.out.println("Comparing to objects ");
		BooksDTO java = new BooksDTO("java", 100, 4, "Appu");
		BooksDTO html = new BooksDTO("html", 50, 2, "Appu");
		
		
		int  s = java.compareTo(html);
		System.out.println("The value : "+s);
		
		int  s1 = html.compareTo(java);
		System.out.println("The value : "+s1);
		
		
		System.out.println("Using Compare interface [compare To method it is returing int value]");

	}

}
