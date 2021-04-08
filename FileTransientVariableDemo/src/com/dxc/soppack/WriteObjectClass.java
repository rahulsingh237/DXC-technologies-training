package com.dxc.soppack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import com.dxc.spack.Student;

public class WriteObjectClass {
	
	public void WriteObject(){
		 
		try (
			
					FileOutputStream output = new FileOutputStream("D:\\Desktop\\Stud.dat");
					ObjectOutputStream out = new ObjectOutputStream(output);		
		)
		{
			ArrayList<Student> slist = new ArrayList<Student>();
			slist.add(new Student(10,70,70));
			slist.add(new Student(20,75,75));
			slist.add(new Student(30,80,80));
			
			Iterator<Student> it = slist.iterator();
			
			while(it.hasNext())
			{
				Student s = it.next();
				out.writeObject(s);
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}