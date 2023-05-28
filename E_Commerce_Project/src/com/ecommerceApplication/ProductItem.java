package com.ecommerceApplication;

import java.sql.*;

public class ProductItem 
{
    public void viewProduct()
    {
    	try
 	   {
 		   Connection con=DBConnection.getConnection();
 		   String query="select * from products";
 		   PreparedStatement pst=con.prepareStatement(query);
 		   ResultSet rs=pst.executeQuery();
 		   System.out.println("**The Products are***");
 		   while(rs.next())
 		   {
 				   if(rs.getInt(4)!=0)
 				   {
 					   System.out.println("Product id>>"+rs.getInt(1));
 					   System.out.println("Product Name>>"+rs.getString(2));
 					   System.out.println("Product Description>>"+rs.getString(3));
 					   System.out.println("Amount>>"+rs.getLong(5));
 					   System.out.println("Quantity>>"+rs.getInt(4));
 			   
 				   }
 			  }
 	   }
 		catch(SQLException e)
 	   {
 		   e.printStackTrace();
 	   }
    }
    
    
    public void notPurchase()
    {
    	try
  	   {
  		   Connection con=DBConnection.getConnection();
  		   String query="select * from products";
  		   PreparedStatement pst=con.prepareStatement(query);
  		   ResultSet rs=pst.executeQuery();
  		   int x=rs.getFetchSize();
  		   System.out.println("**Not Purchase item***");
  		   while(rs.next())
  		   {
  			  if(rs.getInt(4)==0)
  				   {
  					   System.out.println("Product id>>"+rs.getInt(1));
  					   System.out.println("Product Name>>"+rs.getString(2));
  					   System.out.println("Product Description>>"+rs.getString(3));
  					   System.out.println("Amount>>"+rs.getLong(5));
  					   System.out.println("Quantity>>"+rs.getInt(4));
  			   
  			       }
  	            }
  		   }
  		catch(SQLException e)
  	   {
  		   e.printStackTrace();
  	   }
    }
 }
