package com.ecomerseAplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Calculate_bill {
	 static int total_amount = 0;

	public int Billing() {
		Connection con=DBConnection1.getcon();
		PreparedStatement pst=null;
		ResultSet rs=null;
		String query="Select qprice1,qpur1 from cart where pid1=?";
		
		try {
			 pst=con.prepareStatement(query);
			 System.out.println("Enter product id");
			 Scanner sc=new Scanner(System.in);
			 int pid1=sc.nextInt();
			 pst.setInt(1, pid1);
			 
			 rs=pst.executeQuery();
			 System.out.println("********* Admin will  calculate  a bill***********");
			 int p_price = 0;
			 int p_quentity = 0;
			 
			 while(rs.next()) {
				 
				 p_price=rs.getInt("qprice1");
				  p_quentity=rs.getInt("qpur1");
				  
				 
			 }
			 total_amount= p_price * p_quentity;
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total_amount;
		
	}
	public void show_bill() {
		this.total_amount=total_amount;
		System.out.println("Total Amount of product is>>>"+total_amount);
		
	}

}
