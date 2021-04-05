package com.xwork.xworkzapp.compare;

public class BooksDTO implements Comparable<BooksDTO> {

	private String bookName;
	private int noOfpages;
	private int edition;
	private String author;

	public BooksDTO(String bookName, int noOfpages, int edition, String author) {
		super();
		this.bookName = bookName;
		this.noOfpages = noOfpages;
		this.edition = edition;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNoOfpages() {
		return noOfpages;
	}

	public void setNoOfpages(int noOfpages) {
		this.noOfpages = noOfpages;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int compareTo(BooksDTO o) {
		if(this.getNoOfpages() > o.getNoOfpages())
			return 1;
		else if(this.getNoOfpages() < o.getNoOfpages())
		return -1; 
		
		return 0;
	}

}
