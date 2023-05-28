package com.ecomerseAplication;

import java.util.Scanner;

public class GuestOperation {
	public void guestoperation() {
		System.out.println("1.View product iteam");
		System.out.println("2.Not purchase iteam");
		System.out.println("3. Exit");
		System.out.println("Enter your choice");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice){
		case 1: ProductItem p1=new ProductItem();
		        p1.viewProduct();
		        break;
		case 2: ProductItem p2=new ProductItem();
        p2.notPurchase();
        break;

		case 3: Exit E1=new Exit();
             E1.exit();
             break;
        default: System.out.println("****Enter correct choice****");

		}
	}

}
