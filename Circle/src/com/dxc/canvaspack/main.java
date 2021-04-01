package com.dxc.canvaspack;
import com.dxc.cpack.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1 = new circle(5.5,"Pink");
		System.out.println(c1);
		circle c2 = new circle();
		System.out.println(c2);
		
		circle c3 = new circle(4.5);
		System.out.println(c3);
		circle c4 = new circle("red");
		System.out.println(c4);
	}

}
