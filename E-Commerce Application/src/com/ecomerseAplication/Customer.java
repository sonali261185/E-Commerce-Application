package com.ecomerseAplication;

import java.sql.*;

public class Customer 
{
   public void viewUser()
   {
	   try {
		   Connection con=DBConnection1.getcon();


		   String query="select * from userdetails";
		   PreparedStatement pst=con.prepareStatement(query);
		   ResultSet rs=pst.executeQuery();
		   while(rs.next())
		   {
			   System.out.println("Username>>"+rs.getString(7));
			   System.out.println("FirstName>>"+rs.getString(2));
			   System.out.println("LastName>>"+rs.getString(3));
			   System.out.println("EmailId>>"+rs.getString(1));
			   System.out.println("MobileNumber>>"+rs.getLong(5));
			   System.out.println("City>>"+rs.getString(6));
			   
		   }
	   }
	   catch(SQLException e)
	   {
		   e.printStackTrace();
	   }
   }
}
