package com.ecomerseAplication;

import java.util.Scanner;

public class UserOperation {
	public void UserOPerations(){
    	System.out.println("1.User Registration");
		System.out.println("2.User Login");
		System.out.println("3.User view product item as sorted order");
		System.out.println("4.Buy Product");
		System.out.println("5.View card");
		System.out.println("6.Purchase the item");
		System.out.println("7.Exit");
		System.out.println("Enter a choice");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice){
		case 1:Registration R1=new Registration();
		       R1.getUserRegisterDetails();
		       break;
		case 2:System.out.println("enter the username");
		        Scanner scanner1=new Scanner(System.in);
	        	String username=scanner1.next();
	        	System.out.println("enter the password");
		        String password= sc.next();
	        	UserLogin userLogin=new UserLogin();
		        userLogin.insertuserData(username, password);
	        	break;
		case 3:ProductInfo  ProductInfo=new ProductInfo();
		        ProductInfo.displayProduct();
		        break;
		case 4: Product2 p1=new Product2();
		        p1.buyProduct();
		        break;
		case 5: Cart c1=new Cart();
		        System.out.println("product iteam has been added to cart");
		        
		        break;
		case 6: Bill b1=new Bill();
		        b1.bill();
		        break;
		               
   		case 7 : Exit E1=new Exit();
		        E1.exit();
		        break;
		default:System.out.println("Enter correct choice");
		}
		}
}




