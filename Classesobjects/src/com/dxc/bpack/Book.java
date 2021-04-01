package com.dxc.bpack;

public class Book {
	private int bookID;
	private String bookname;
	private int bookPrice;
	

	public Book(int bookID, String bookname, int bookPrice) {
		super();
		this.bookID=bookID;
		this.bookname=bookname;
		this.bookPrice=bookPrice;
	}
		
	 @Override 
	 public String toString() {
		 return "Book [bookID=" + bookID +", bookname=" + bookname + ", bookPrice=" + bookPrice + "]";
	 }
	 


}
