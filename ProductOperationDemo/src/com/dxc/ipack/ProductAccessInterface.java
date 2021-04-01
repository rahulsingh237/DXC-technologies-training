package com.dxc.ipack;

import com.dxc.prodpack.Product;

public interface ProductAccessInterface {
	String addProduct(int pId,String pName,int pPrice);
	Product searchProductbyId(int pId);
	Product searchProductbyName(String pName);
	String updateProductPrice(int pId, int pPrice);
	Product[] getAllProduct();
}
