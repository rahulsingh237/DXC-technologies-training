package com.dxc.mainpack;
import com.dxc.accpack.*;
public class Main {

	public static void main(String[] args) {
		Account acc1=new Account("Savings Account",3000);
		System.out.println(acc1);
		
		Account acc2=new Account("Savings Account",3800);
		System.out.println(acc2);
	}

}
