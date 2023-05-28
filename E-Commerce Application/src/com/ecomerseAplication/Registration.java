package com.ecomerseAplication;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Registration
{
	public void userRegister(String useremailid,String userfirstname,String userlastname,String password,String mobileno,String city,String Username) 
	{
		try
		{
		

	Connection connection = DBConnection1.getcon();
	PreparedStatement preparedStatement=connection.prepareStatement("insert into userdetails (useremailid,userfirstname,userlastname,password,mobileno,city,Username)values(?,?,?,?,?,?,?)");
	preparedStatement.setString(1, useremailid);
	preparedStatement.setString(2, userfirstname);
	preparedStatement.setString(3, userlastname);
	preparedStatement.setString(4, password);
	preparedStatement.setString(5,mobileno);
	preparedStatement.setString(6,city);
	preparedStatement.setString(7,Username);

	
	int j=preparedStatement.executeUpdate();
	System.out.println("register login sucessfully>> >>"+j);
	

}   catch(Exception e) {
	  e.printStackTrace();
}
		
	}		
		
	  public void getUserRegisterDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the useremailid>>");
		String useremailid=scanner.next();
		System.out.println("enter the userfirstname registration>>");
		String userfirstname=scanner.next();
		System.out.println("enter the userlastname registration>>");
		String userlastname=scanner.next();
		System.out.println("enter the password registration");
		String password=scanner.next();
		System.out.println("enter the mobile number");
		String mobileno=scanner.next();
		System.out.println("enter the city");
		String city=scanner.next();
		System.out.println("enter the Username");
		String Username=scanner.next();
		
		Registration register=new Registration ();
	  register.userRegister(useremailid,userfirstname,userlastname,password,mobileno,city,Username);
	}
	
}
