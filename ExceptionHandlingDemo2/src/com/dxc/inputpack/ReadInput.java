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
		} catch (IOException |NumberFormatException|ArithmeticException|ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured:   "+e.getMessage());
			
			//e.printStackTrace();
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
		
		public static void readInput2()
		{
			try (InputStreamReader ir = new InputStreamReader(System.in);
				 BufferedReader br = new BufferedReader(ir); 	
					)
			{
				int res = Integer.parseInt(br.readLine())/Integer.parseInt(br.readLine());
				System.out.println(res);
			}catch(NumberFormatException | IOException |ArithmeticException|ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception occured:   "+e.getMessage());
				
				//e.printStackTrace();
			} 
		
		}
		public void readInput3() throws NumberFormatException, IOException
		{
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
			int res = Integer.parseInt(br.readLine())/Integer.parseInt(br.readLine());
			System.out.println(res);
		}

}
