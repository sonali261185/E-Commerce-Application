package com.ecomerseAplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Add_products{
	
    public void add_product_detail() {
    	Connection con=DBConnection1.getcon();
    	PreparedStatement pst=null;
    	String query="insert into product_details value(?,?,?,?,?)";

    try {
		pst=con.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("How many records you want to add");
		int noOfrecords=sc.nextInt();
		if(noOfrecords>0) {
			for(int i=0;i<noOfrecords;i++) {
				System.out.println("Enter product Id>>>");
				int id=sc.nextInt();
				System.out.println("Enter product Name>>>");
				String name=sc.next();
				sc.nextLine();
				System.out.println("Enter product Description>>>");
				String des=sc.nextLine();
				//sc.nextLine();
             	System.out.println("Enter product Quantity>>>");
				int quentity=sc.nextInt();
				System.out.println("Enter product Price>>>");
				int price=sc.nextInt();
				pst.setInt(1, id);
                pst.setString(2, name);
                pst.setString(3, des);
                pst.setInt(4,price );
                pst.setInt(5, quentity);
                pst.executeUpdate();
                System.out.println("procces of inserting product detail is succesfully completed......");
				

				
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
   
	
	

}
