package com.dxc.mainpack;
import com.dxc.emppack.*;


public class Main {
	public static void main(String[] args)
	{
		//Employee e1 = new Employee(100,"xxxx",30000);
		//it is showing error because abstract class cannot be instantiated
		
		Manager e1 = new Manager(100,"Ujjwal",40000,"IT",5);
		System.out.println(e1.getDetails()+"  Netsalary: "+e1.calcNetSalary());
		
		Employee e2 = new Programmer(200,"Nikhil",50000,"Full Stack",3);
		Programmer p = (Programmer)e2;
		System.out.println(e2.getDetails()+"  Net Salary: "+p.calcNetSalary());
	}
}
