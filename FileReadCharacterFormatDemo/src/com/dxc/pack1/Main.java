package com.dxc.pack1;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (
			FileReader input = new FileReader("D:\\DXC2021JAVAWORKSPACE\\FileExample\\One.txt");
			BufferedReader br = new BufferedReader(input);){
			String str = br.readLine();
			while(!(str.equalsIgnoreCase("END")))
			{
				System.out.println(str);
				str = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
