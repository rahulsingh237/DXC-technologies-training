package com.dxc.soppack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.dxc.spack.Student;

public class ReadObjectClass {
	public void ReadObject()
	{
		try (
				
				FileInputStream input = new FileInputStream("D:\\Desktop\\Stud.dat");
				ObjectInputStream in = new ObjectInputStream(input);		
				)
		{
			while(input.available()>0)
			{
				Student sob = (Student)in.readObject();
				sob.setTotal();
				System.out.println(sob);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
