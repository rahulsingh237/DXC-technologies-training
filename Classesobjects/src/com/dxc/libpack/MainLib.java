package com.dxc.libpack;
import com.dxc.bpack.Book;
public class MainLib {

	public static void main(String[] args) {
		/*Book book1 = new Book(100,"Java",200);
		System.out.println(book1);
		Book book2 = new Book(200,"JavaScript",200);
		System.out.println(book2);
		Book book3 = new Book(300,"OOPS",200);
		System.out.println(book3);
		Book book4 = new Book(400,"DSA",200);
		System.out.println(book4);*/
		
		Book[] barray = new Book[4];
		barray[0]=new Book(100,"Java",200);
		barray[1]=new Book(200,"JavaScript",200);;
		barray[2]=new Book(300,"OOPS",200);
		barray[3]=new Book(400,"DSA",200);
		
		for(Book b:barray)
		{
			System.out.println(b);
		}
	}

}
