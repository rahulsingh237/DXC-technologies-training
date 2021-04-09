package com.dxc.mainpack;

import java.sql.*;


public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","Password");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from BOOK");
		while(rs.next())
        {
            System.out.println(rs.getInt(1)+"          "+rs.getString(2)+"              "+rs.getInt(3));

        }
		con.close();
	}

}
