package com.ecommerceApplication;

import java.sql.*;
import java.util.*;

public class Product 
{
	private static final String Exit = null;

	public void buyProduct()
	{
		Scanner scanner=new Scanner(System.in);
		String ch = null;
		 int flag=0;
		Cart cart=new Cart();
		do
		{
		  try
		  {
			 Connection con=DBConnection.getConnection();
		      System.out.print("Enter Product Id>>");
		      int pid=scanner.nextInt();
		      String query="select * from products where pid=?";
		      PreparedStatement pst=con.prepareStatement(query);
		      pst.setInt(1, pid);
			  ResultSet rs=pst.executeQuery();
			 
		      while(rs.next())
			   {
		    	  
				      System.out.println("Enter the Quantity>>");
					  int quantity=scanner.nextInt();
					  if(quantity>rs.getInt(4))
					  {
						  System.out.println("Stock Not Available");
					  }
					  else
					  {
						  System.out.println("Stock available");
						  int quantity1=rs.getInt(4)-quantity;
						  String query1="update products set quantity=? where pid=?";
						  PreparedStatement pst1=con.prepareStatement(query1);
						  pst1.setInt(1,quantity1);
						  pst1.setInt(2, pid);
						  int i=pst1.executeUpdate();
						  //System.out.println("Quantity updated");
						 
						  cart.addCart(rs.getInt(1), rs.getString(2), rs.getString(3), quantity, rs.getInt(5), rs.getInt(6));
						  System.out.println("Do You want to view cart(Y for Yes, N for No)");
						  ch=scanner.next();
						  cart.viewCart();
						  flag=1;
					      break;
					  }
					  if(flag==0)
				      System.out.println("No Product available");
			   } 
			         
		     }
		  catch(SQLException  | NullPointerException e)
		      {
			    e.printStackTrace();
		      }
		  System.out.println("Do you want to continue PRESS(Y for yes,N for No)");
	      ch=scanner.next();
		}while(ch.equalsIgnoreCase("Y"));
	}
		
	public void checkQuantity()
	{
      try
      {
	  Connection con=DBConnection.getConnection();
      Scanner scanner=new Scanner(System.in);
      System.out.print("Enter Product Id>>");
      int pid=scanner.nextInt();
      String query="select * from products where pid=?";
      PreparedStatement pst=con.prepareStatement(query);
      pst.setInt(1, pid);
	  ResultSet rs=pst.executeQuery();
	  int flag=0;
      while(rs.next())
	   {
		  if(rs.getInt(1)==pid)
		  {
		    System.out.println("Quantity>>"+rs.getInt(4));
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
