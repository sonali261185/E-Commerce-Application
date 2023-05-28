package com.ecomerseAplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductInfo 
{

	public  void displayProduct() { 
		try {
			
			
			Connection connection = DBConnection1.getcon();
//Class.forName("com.mysql.jdbc.Driver");
		
			PreparedStatement preparedStatement=connection.prepareStatement("select * from product_details order by contain_id asc ");
			ResultSet resultSet=preparedStatement.executeQuery();
			
			int contain_id=0;
			String PName=null;
			String Description=null;
			int price=0;
			int quantity=0;
			
				
			System.out.println("product list Ascending order details >>");
			
			while(resultSet.next()) {
				contain_id=resultSet.getInt(1);
				PName=resultSet.getString(2);
				Description=resultSet.getString(3);
			    price=resultSet.getInt(4);
				quantity=resultSet.getInt(5);
				
				
				System.out.println(" id>>  " + contain_id);
				System.out.println(" productname  " +PName);
				System.out.println(" description   " +Description);
				System.out.println(" productprice   " +price);
				System.out.println(" quantity  "+quantity );
           
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		}
	
public void getproductDetails()
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the productid>>");
	int id=scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("enter the product name>>");
	String name=scanner.nextLine();
	
	System.out.println("enter the product description >>");
	String description =scanner.nextLine();
	
	System.out.println("enter the product price>>");
	int price=scanner.nextInt();
	
	System.out.println("enter product quantity>>");
	int quantity=scanner.nextInt();
	
	ProductInfo pinfo=new ProductInfo();
	pinfo.addProductSetails(id,name,description,price,quantity);
}
	
		public void addProductSetails(int id,String name,String description,int price,int quantity) 
		{
			try
			{
			
				  Connection con=DBConnection1.getcon();

		PreparedStatement preparedStatement=con.prepareStatement("insert into productdetails (id,name,description,price,quantity)values(?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, description);
		preparedStatement.setInt(4, price);
		preparedStatement.setInt(5,quantity);
		int j=preparedStatement.executeUpdate();
		System.out.println("Product added sucessfully>> >>"+j);
		

			}catch(Exception e) {
				System.out.println(e);
			}
	
}
}
