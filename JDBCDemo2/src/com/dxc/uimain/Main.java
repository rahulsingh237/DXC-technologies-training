package com.dxc.uimain;

import java.util.Scanner;
 
import com.dxc.data.BOOKDAO;
import com.dxc.model.Book;
 
public class Main {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        while(true){

            System.out.println("1. Add a Book");  // Admin 
            System.out.println("2. Search a Book by Id"); // Admin/User
            System.out.println("3. Search  a Book  by name");// Admin/User
            System.out.println("4. Update a Book  price");// Admin
            System.out.println("5. Update a Book  Name");
            System.out.println("6.  Get all the Books");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice)
            {
            case 1:
            {
                System.out.println("Enter the product id");
                int pId = sc.nextInt();
                System.out.println("Enter the product name");
                String pName = sc.next();
                System.out.println("Enter product price");
                int pPrice = sc.nextInt();

                ;

                break;
            }
            case 2:
            {
                System.out.println("Enter the book id to be searched");
                int bookId = sc.nextInt();
                Book book = BOOKDAO.getABook(bookId);
                System.out.println(book);

                break;
            }
            case 3:
            {
                System.out.println("Enter the product name to be searched");
                String pName = sc.next();

                break;
            }
            case 4:
            {
                System.out.println("Enter the product id");
                int pId = sc.nextInt();
                System.out.println("Enter product price to be updated");
                int pPrice = sc.nextInt();



                break;
            }

            case 5:
            {
                break;
            }
            case 6:
            {

                break;
            }

            case 7:
            {
                sc.close();
                System.out.println("Bye Bye!!!");
                BOOKDAO.closeCon();
                System.exit(0);
            }


            }







        }
 
    }
 
}