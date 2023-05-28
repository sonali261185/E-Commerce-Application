package com.ecomerseAplication;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserLogin 
{

	public void insertuserData(String username, String password)
	{
		
		
  try
  {
		Connection connection = DBConnection1.getcon();
  
   PreparedStatement preparedStatement = connection.prepareStatement("insert into userlogin(username,password)values(?,?)");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
		

			int i = preparedStatement.executeUpdate();
			System.out.println("Record is inserted successfully userlogin table.." + i);
		
			connection.close();
			preparedStatement.close();
			
		//	ProductInfo productinfo=new ProductInfo();
			//productinfo.displayProduct();
		} catch (Exception e) 
  {
			e.printStackTrace();
		} 
  
 }	
	
}
