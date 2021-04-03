package com.dxc.main;
import com.dxc.utility.*;
public class Main {
	public static void main(String[] args) {
        Utility hs = new Utility();
        System.out.println(hs.formatNumber(500.9989F)); 
        System.out.println(hs.formatNumber(89.9934)); 
        System.out.println(hs.formatNumber("550")); 
    }
}
