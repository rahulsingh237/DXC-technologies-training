package com.dxc.pack1;
import java.io.File;
import java.io.IOException;
//import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		File file1 = new File("D:\\DXC2021JAVAWORKSPACE\\FileExample\\One.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
//		System.out.println("File created successfully!!");
//		System.out.println(file1.getAbsolutePath());
//		System.out.println(file1.getName());
//		System.out.println(file1.getParent());
		File file2 = new File("D:\\DXC2021JAVAWORKSPACE\\FileExample","two.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		File dir = new File("D:\\DXC2021JAVAWORKSPACE\\FileExample");
		File[] flist = dir.listFiles();
		for (File f:flist)
		{
			if(f.isFile()) // only files
			{
				System.out.println(f.getName());
			}
		}
	}
}
