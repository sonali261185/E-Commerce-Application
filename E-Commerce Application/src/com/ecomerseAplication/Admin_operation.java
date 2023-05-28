package com.ecomerseAplication;

import java.util.Scanner;

public class Admin_operation {
	public void adminOPerations(){
		System.out.println("1.Add product");
		System.out.println("2. calculate Bill");
		System.out.println("3.Diplay Bill");
		System.out.println("4.Check quantity");
		System.out.println("5.Check registered user");
		System.out.println("6.Check the perticular user history");
		System.out.println("7.Exit");
		System.out.println("Enter a choice");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice){
		case 1:Add_products a1=new Add_products();
		       a1.add_product_detail();
		       break;
		case 2:Calculate_bill c1=new Calculate_bill();
                c1.Billing();
                 break;
		case 3:Calculate_bill c2=new Calculate_bill();
                c2.show_bill();
                break;
		case 4: Product2 p1=new Product2();
		         p1.checkQuantity();
		         break;
		case 5:Customer cust=new Customer();
		       cust.viewUser();
		       break;
		case 6:CustomerHistory1 C1=new CustomerHistory1();
	            C1.userHistory();
	            break;
		case 7: Exit E1=new Exit();
		
		        E1.exit();
	    default: System.out.println("****Enter Correct choice****");
		        

                 
       
			
		}
		
	}

}
