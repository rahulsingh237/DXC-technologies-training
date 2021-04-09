package com.dxc.model;

public class Book {
	private int id;
	private String name;
	private int price;
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public String getNamel() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
}
