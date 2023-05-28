package com.ecomerseAplication;

import java.util.Scanner;

public class ElectronicShop
{
	
	public void Home() throws Exception
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println(" 1 <<User login");
		System.out.println(" 2 <<User Registration");
		System.out.println(" 3 <<Product details");
		
		System.out.println("Please Enter Your Choice");
		Integer s1=scanner.nextInt();
		switch(s1)
		{
			case 1:
				System.out.println("enter the username");
				Scanner scanner1=new Scanner(System.in);
				String username=scanner1.next();
				System.out.println("enter the password");
				String password= scanner.next();
				UserLogin userLogin=new UserLogin();
				userLogin.insertuserData(username, password);
				break;
				
			case 2:
				Registration registration =new Registration ();
				registration.getUserRegisterDetails();
				break;
			case 3:
				ProductInfo  ProductInfo=new ProductInfo();
				ProductInfo .getproductDetails();
				break;
	}
	}
	
	public static void main(String[] args) throws Exception
	{
		ElectronicShop electronicshop=new ElectronicShop();
		electronicshop.Home();
	}
}
