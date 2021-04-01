package com.dxc.prodpack;

public class Product {
	private int pId;
	private String pName;
	private int pPrice;
	public Product(int pId, String pName, int pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	
}
