package com.dxc.data;

import java.io.IOException;
import java.sql.*;

import com.dxc.model.Book;
import com.sun.jdi.connect.spi.Connection;

public class BOOKDAO {
	private  static Connection con=null;
	public static String insertBook(Book b)
	{
		return("Book Inserted Successfully");
	}
	public static Book getABook(int bookId)
	{
		con = (Connection) DataManager.getConnection();
		Statement st = null;
		Book b = null;
		try {
			st.getConnection().createStatement();
			ResultSet rs = st.executeQuery("select * from BOOK where id=bookId");
			if(rs.next())
			{
				b = new Book(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return b;
	}
	public static void closeCon()
	{
		try {
            con.close();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//updated price
	public static boolean updatePrice(int bid, int price)
	{
		return false;
	}
	//updated name
	public static boolean updateName(int bid, String name)
	{
		return false;
	}
}
