package com.dxc.cpack;

import com.dxc.ipack.ProductAccessInterface;
import com.dxc.prodpack.Product;

public class ProductAccessImpl implements ProductAccessInterface{

	private Product[] parr = new Product[5];
	private static int i=0;
	@Override
	public String addProduct(int pId, String pName, int pPrice) {
		parr[i++]=new Product(pId,pName,pPrice);
		return "Product added successfully";
	}

	@Override
	public Product searchProductbyId(int pId) {
		for(Product p:parr)
		{
			if(p.getpId()==pId)
				return p;
		}
		return null;
	}

	@Override
	public Product searchProductbyName(String pName) {
		for(Product p:parr)
		{
			if(p.getpName()==pName) return p;
		}
		return null;
	}

	@Override
	public Product[] getAllProduct() {
		
		return parr;
	}

	@Override
	public String updateProductPrice(int pId,int pPrice) {
		for(Product p:parr)
		{
			if(p.getpId()==pId) {
				p.setpPrice(pPrice);
				return "Price is changed";
			}
		}
		return "Product Not Found";
	}

}
