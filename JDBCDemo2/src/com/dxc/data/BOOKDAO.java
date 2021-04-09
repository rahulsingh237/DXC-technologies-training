package com.dxc.data;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
import com.dxc.model.Book;
 
public class BOOKDAO {

    private  static Connection con=(Connection) DataManager.getConnection();;

    public static String insertBook(int bookId,String bookName,int bookPrice)
    {
        
        PreparedStatement ps = null;

        String str = "Insert into BOOK values (?,?,?)";

        try {
            ps = con.prepareStatement(str);

        ps.setInt(1, bookId);
        ps.setString(2, bookName);
        ps.setInt(3, bookPrice);

         int rowcount= ps.executeUpdate();

         if (rowcount!=1)   // No. of rows inserted
                return "Insert row failed";
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return("Book inserted successfully");
    }

 
    public static Book getABook(int bookId)
    {
        con =(Connection) DataManager.getConnection();

        Statement st =null;
        Book book = null;

        try {
            st = con.createStatement();


        ResultSet rs = st.executeQuery("Select * from BOOK where ID="+bookId);

        if (rs.next())    
        {
            book =  new Book(rs.getInt(1),rs.getString(2),rs.getInt(3));
        }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


          return book;

    }


    public static Book getABook(String bookName){

        con =(Connection) DataManager.getConnection();

        Statement st =null;
        Book book = null;
        try {
            st = con.createStatement();

            ResultSet rs = st.executeQuery("Select * from BOOK where NAME='"+bookName+"'");

            if (rs.next())    
            {
                book =  new Book(rs.getInt(1),rs.getString(2),rs.getInt(3));
            }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


              return book;

    }


    public static ArrayList<Book>  getAllBooks()
    {
        ArrayList<Book> blist = new ArrayList<Book>();
       con =(Connection) DataManager.getConnection();        
        Statement st =null;

        try {
            st = con.createStatement();

            ResultSet rs = st.executeQuery("Select * from BOOK");

            while (rs.next())    
            {
                blist.add( new Book(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

              return blist;        

    }



                         // Updated price
    public static String updatePrice(int bid,int price)
    {
    	String query = "UPDATE BOOK SET PRICE = ? WHERE ID = ?";
    	PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1,price);
	    	ps.setInt(2, bid);
	    	int res = ps.executeUpdate();
	    	if(res != 1)
	    		return "Updation operation failed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return "Price updated successfully";
    }

    public static String updateName(int bid,String Name)
    {
    	String query = "UPDATE BOOK SET NAME = ? WHERE ID = ?";
    	PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, Name);
	    	ps.setInt(2, bid);
	    	int res = ps.executeUpdate();
	    	if(res!=1)
	    		return "Update operation failed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
    	
        return "Table updated";
    }

    public static void closeCon()
    {
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}