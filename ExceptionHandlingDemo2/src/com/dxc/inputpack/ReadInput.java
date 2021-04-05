package com.dxc.inputpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {

	public static void readInput1() {
		InputStreamReader ir = null;
		BufferedReader br = null;
		String str1=null;
		String str2=null;
		int res=0;
		
		ir = new InputStreamReader(System.in);
		br = new BufferedReader(ir);
		System.out.println("enter two integers: ");
		try {
			str1 = br.readLine();
			str2 = br.readLine();
			res = Integer.parseInt(str1)/Integer.parseInt(str2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println(res);
			try {
				ir.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
