package com.ecommerceApplication;

import java.util.*;

public class Ecommerce_Project 
{
	static{
		System.out.println("***********Welcome to E_Commerce based application************");
		}
	public static void main(String[] args) {
		
		System.out.println("1.User Operation");
		System.out.println("2.Addmin Operation");
		System.out.println("3.Guest Operation");
		System.out.println("4.Exit");
		System.out.println("Enter one option");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) 
		{
		case 2://Product p=new Product();
		       //p.buyProduct();
			   //p.checkQuantity();
			   //Customer cust=new Customer();
			   //cust.viewUser();
			  // CustomerHistory customer=new CustomerHistory();
			   //customer.userHistory();
			   // ProductItem product=new ProductItem();
			    //product.viewProduct();
			    //product.notPurchase();
			    Bill bill=new Bill();
			    bill.generateBill();
			    bill.bill();
			   //break;
		}
		
		
		//main(null);

		
		
	}

}
