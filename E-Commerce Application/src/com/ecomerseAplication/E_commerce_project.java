package com.ecomerseAplication;

import java.util.Scanner;


public class E_commerce_project {
	static{
		System.out.println("***********Welcome to E_Commerce based application************");
		}
	public static void main(String[] args) {
		
		
		System.out.println("1.User Operation");
		System.out.println("2.Admin Operation");
		System.out.println("3.Guest Operation");
		System.out.println("4.Exit");
		System.out.println("Enter one option");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:UserOperation U1 = new UserOperation();
		              U1.UserOPerations();
		              main(null);
		              break;
		case 2:Admin_operation a1=new Admin_operation();
		             a1.adminOPerations();
		             main(null);
		             break;
		case 3:GuestOperation G1=new GuestOperation();
		            G1.guestoperation();
		            main(null);
		            break;
		case 4: Exit E1=new Exit();
		             E1.exit();
		             break;
		default: System.out.println("****Enter correct choice****");
		            }
		
		
		//main(null);

		
		
	}

}
