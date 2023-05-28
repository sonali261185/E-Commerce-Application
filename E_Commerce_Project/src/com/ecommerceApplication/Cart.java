package com.ecommerceApplication;

import java.sql.*;
import java.util.*;

public class Cart 
{
    ArrayList<Integer> pid=new ArrayList<Integer>();
    ArrayList<String> pname=new ArrayList<String>();
    ArrayList<String> pdep=new ArrayList<String>();
    ArrayList<Integer> qpur=new ArrayList<Integer>();
    ArrayList<Float> qprice=new ArrayList<Float>();
    ArrayList<Integer> userid=new ArrayList<Integer>();
    		
   public void addCart(int pid1,String pname1,String pdep1,int qpur1,float qprice1,int userid1) 
    {
    	pid.add(pid1);
    	pname.add(pname1);
    	pdep.add(pdep1);
    	qpur.add(qpur1);
    	qprice.add(qprice1);
    	userid.add(userid1);
    	try
    	{
    	Connection con=DBConnection.getConnection();
    	String query="insert into cart(pid1,pname1,pdep1,qpur1,qprice1,userid1)values(?,?,?,?,?,?)";
    	PreparedStatement pst=con.prepareStatement(query);
    	pst.setString(1,Integer.toString(pid1));
    	pst.setString(2, pname1);
    	pst.setString(3, pdep1);
    	pst.setString(4, Integer.toString(qpur1));
    	pst.setString(5, Float.toString(qprice1));
    	pst.setString(6, Integer.toString(userid1));
    	int i=pst.executeUpdate();
     }
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
   
    }
    
    public void viewCart()
    {
    	int x=pid.size();
    	if(x!=0)
    	{
    		System.out.println("*****Your CART Is****");
    		float TotalAmount=0.0f;
    		for(int i=0;i<x;i++)
    		{
    		 TotalAmount=qpur.get(i) * qprice.get(i);
    		}
    		for(int i=0;i<x;i++)
    		{
    			System.out.println("ProductId>>"+pid.get(i));
    			System.out.println("ProductName>>"+pname.get(i));
    			System.out.println("ProductDescription>>"+pdep.get(i));
    			System.out.println("QuantityPurchased>>"+qpur.get(i));
    			System.out.println("TotalPrice>>"+TotalAmount);
    		}
    	}
    	else
    	{
    		System.out.println("CART is Empty");
    	}
    	
    	}
    }

