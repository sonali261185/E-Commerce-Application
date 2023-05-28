package com.ecomerseAplication;

import java.sql.*;
import java.util.Scanner;

public class CustomerHistory1 
{
   public void userHistory()
   {
	  try
	    {
		  Connection con=DBConnection1.getcon();
	      Scanner scanner=new Scanner(System.in);
	      System.out.print("Enter the Product Id>>");
	      int id=scanner.nextInt();
	      String query="select * from cart where pid1=?";
	      PreparedStatement pst=con.prepareStatement(query);
	      pst.setInt(1, id);
		  ResultSet rs=pst.executeQuery();
		  int flag=0;
	      while(rs.next())
		   {
			  
				System.out.println("Product id>>"+rs.getInt(1));
				System.out.println("Product Name>>"+rs.getString(2));
				System.out.println("Product Description>>"+rs.getString(3));
			    System.out.println("Quantity>>"+rs.getInt(5));
			    flag=1;
			    break;
		   }
	      if(flag==0)
	    	  System.out.println("No Product available");
	      }
	    catch(SQLException e)
	      {
		    e.printStackTrace();
	      }
   }
}