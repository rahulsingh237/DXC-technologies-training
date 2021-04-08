package com.dxc.pack2;

import java.util.Scanner;

public class Ternary {
public static int Op(int a, int b, int c)
{ int result;
result=(int)((a>b)?((a>c)?a:c):(b>c?b:c));
return result;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter three vairbales:");
 a = sc.nextInt();
 b= sc.nextInt();
 c=sc.nextInt();
System.out.println("The maximum of the three Number is: "+Ternary.Op(a, b, c));
	}

}
