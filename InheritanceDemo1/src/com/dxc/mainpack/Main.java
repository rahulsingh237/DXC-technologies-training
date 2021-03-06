package com.dxc.mainpack;
import com.dxc.emppack.*;
import com.dxc.taxpack.Tax;

public class Main {
	public static void main(String[] args)
	{
		Employee emp=new Employee(100,"Veena",40000);
		System.out.println(emp.getDetails());
		
		Manager manager = new Manager(200,"Rahul",60000,"IT",5);
		System.out.println(manager.getDetails());
		
		Employee e = new Manager(201,"Saiteja",60000,"r&d",5);
		System.out.println(e.getDetails());
		
		Employee[] emparr=new Employee[4]; //heterogeneous array
		emparr[0] = new Employee(100,"Harleen",40000);
		emparr[1] = new Manager(200,"Lochana",50000,"Finance",6);
		emparr[2] = new Programmer(300,"Yashwant",45000,"Java",2);
		emparr[3] = new Manager(201,"Ashwani",50000,"IT",10);
		System.out.println();
		System.out.println();
		System.out.println("Printing Employee details:");
		for(Employee em:emparr)
		{
			System.out.println(em.getDetails()+"   Tax Calculated="+Tax.calcTax(em));
		}
				
	}
}
