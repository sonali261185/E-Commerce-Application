package com.ecomerseAplication;

import java.sql.*;
import java.util.*;

public class Product 
{
	public void checkQuantity()
	{
      try
      {
	  Connection con=DBConnection1.getcon();
      Scanner scanner=new Scanner(System.in);
      System.out.print("Enter Product Id>>");
      int pid=scanner.nextInt();
      String query="select * from product_details where contain_id=?";
      PreparedStatement pst=con.prepareStatement(query);
      pst.setInt(1, pid);
	  ResultSet rs=pst.executeQuery();
	  int flag=0;
      while(rs.next())
	   {
		  if(rs.getInt(1)==pid)
		  {
		    System.out.println("Quantity>>"+rs.getInt(5));
		    flag=1;
		    break;
	      }
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
