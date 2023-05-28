package com.ecomerseAplication;

import java.sql.*;
import java.util.*;
public class Bill 
{
     float total_amount=0.0f;
	public void generateBill()
	{
		try
	    {
		  Connection con=DBConnection1.getcon();
	      Scanner scanner=new Scanner(System.in);
	      System.out.print("Enter the user Id>>");
	      int uid=scanner.nextInt();
	      String query="select username from userInfo where exists(select pid1 from cart where cart.userid1=userInfo.id AND cart.userid1=?)";
	      PreparedStatement pst=con.prepareStatement(query);
	      pst.setInt(1, uid);
		  ResultSet rs=pst.executeQuery();
		  while(rs.next())
		   {
	    	 System.out.println("UserName>>"+rs.getString(1));
	    	 
		   }
		  }
	    catch(SQLException e)
	      {
		    e.printStackTrace();
	      }
	}
	public void bill()
	
	{
		//generateBill();
		try {
			
		 Connection con=DBConnection1.getcon();
	      Scanner scanner=new Scanner(System.in);
	      System.out.print("Enter the pid>>");
	      int pid=scanner.nextInt();
		  String query1="select qprice1,qpur1 from cart where pid1=?";
	      PreparedStatement pst1=con.prepareStatement(query1);
	      pst1.setInt(1, pid);
		  ResultSet rs1=pst1.executeQuery();
		  //float p_price = 0.0f;
		  //int q_qty = 0;
			 while(rs1.next()) 
			 {
				 float p_price=rs1.getFloat(1);
				  int q_qty=rs1.getInt(2);
				  total_amount= rs1.getFloat("qprice1") * rs1.getInt("qpur1");
			 }		
			 System.out.println("Total Bill amount>>"+total_amount);

			 
	    }
	    catch(SQLException e)
	      {
		    e.printStackTrace();
	      }
	}
}
