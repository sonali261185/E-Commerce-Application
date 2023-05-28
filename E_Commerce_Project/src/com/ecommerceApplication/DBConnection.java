package com.ecommerceApplication;

import java.sql.*;

public class DBConnection 
{
   public static Connection getConnection()
   {
	   Connection con=null;
	   try
	   {
		   Class.forName("com.mysql.jdbc.Driver");
		   String url="jdbc:mysql://localhost:3306/onlineshopping?characterEncoding=utf8";
		   con=DriverManager.getConnection(url, "root", "sonalipatil26");
	   }
	   catch( ClassNotFoundException | SQLException e)
	   {
		   e.printStackTrace();
	   }
	   return con;
   }
}
