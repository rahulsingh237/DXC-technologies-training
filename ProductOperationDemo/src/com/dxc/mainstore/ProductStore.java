package com.dxc.mainstore;
import com.dxc.cpack.*;
import com.dxc.prodpack.*;
import java.util.Scanner;

public class ProductStore {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			ProductAccessImpl paob = new ProductAccessImpl();
	
			while(true)
			{
				System.out.println("Menu");
				System.out.println("1. Add a product");
				System.out.println("2. Search a product by Id");
				System.out.println("3. Search a product by Name");
				System.out.println("4. Update a product price");
				System.out.println("5. Show the product list");
				System.out.println("6. Exit");
				System.out.println("Enter your choice: ");
				int choice = sc.nextInt();
				switch(choice) 
				{
					case 1: {
						System.out.println("Enter the product Id");
						int pId = sc.nextInt();
						System.out.println("Enter the product name");
						String pName = sc.next();
						System.out.println("Enter product price");
						int pPrice = sc.nextInt();
						System.out.println(paob.addProduct(pId, pName, pPrice));
				
						break;
					}
					case 2: {
						System.out.println("Enter the product Id");
						int pId = sc.nextInt();
						Product p=paob.searchProductbyId(pId);
						System.out.println(p);
						break;
					}
					case 3:{
						System.out.println("Enter the product name");
						String pName = sc.next();
						Product p=paob.searchProductbyName(pName);
						System.out.println(p);
						break;
					}
					case 4:{
						System.out.println("Enter the product Id");
						int pId = sc.nextInt();
						System.out.println("Enter product price");
						int pPrice = sc.nextInt();
						System.out.println(paob.updateProductPrice(pId, pPrice));
						break;
					}
					case 5:{
						Product[] product=paob.getAllProduct();
						for(Product p:product)
						{
							System.out.println(p);
						}
						break;
					}
					case 6:{
						sc.close();
						System.exit(0);
					}
				}
			}
			
	}

}
