package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model.*;

import com.aurionpro.model.DisplayCustomer;

public class DisplayCustomerTest {

	public static void main(String[] args) {
		
		DisplayCustomer[] customer = {
				new DisplayCustomer(1, "rasika", "rsaika@gmailcom", 123),
				new DisplayCustomer(2, "manisha", "manisha@gmail.com", 453),
				new DisplayCustomer(3, "mai", "mai@gmail.com", 173),
				new DisplayCustomer(4, "vedi", "vedi@gmail.com", 783),
				new DisplayCustomer(5, "sani", "sani@gmail.com", 2343),
				new DisplayCustomer(6, "tina", "tina@gmail.com", 623),
				new DisplayCustomer(7, "hina", "hina@gmail.com", 12344),
				new DisplayCustomer(8, "karab", "karan@gmail.com", 1223),
				new DisplayCustomer(9, "sonu", "sonu@gmail.com", 988),
				new DisplayCustomer(10,"monu", "monu@gmail.com", 7845)

		};

		Scanner userin = new Scanner(System.in);
		System.out.println("Enter id, name, email and password: ");
		DisplayCustomer customer1 = new DisplayCustomer();
		customer1.setCustomerID(userin.nextInt());
		customer1.setName(userin.next());
		userin.nextLine();
		customer1.setEmail(userin.nextLine());
		customer1.setPassword(userin.nextInt());
		validateEmailUserInput(customer1);
		System.out.println("--------------------------------------");
		validateEmail(customer);
		for (int i = 0; i < customer.length; i++) {
		System.out.println(customer[i]);
	}
		
		sortArray(customer);
		
	}

	private static void sortArray(DisplayCustomer[] customer) {
		DisplayCustomer temp = null;
		 for (int i = 0; i < customer.length; i++) {
			for (int j = 0; j < customer.length; j++) {
				
			
				if(customer[i].getName().compareToIgnoreCase(customer[j].getName())<0) {
					temp = customer[i];
					customer[i]=customer[j];
					customer[j]=temp;
				
			}
			}
		}
		 for (int i = 0; i < customer.length; i++) {
			 System.out.println(customer[i]);
		}
		 //return obj;
		
	}

	private static DisplayCustomer validateEmail(DisplayCustomer[] customer) {
		DisplayCustomer obj = null;
		for (int i = 0; i < customer.length; i++) {
			obj = customer[i];
			int atTheRate = obj.getEmail().indexOf("@");
			int com = obj.getEmail().indexOf(".com");
			System.out.println(customer[i]);
			
			if(atTheRate !=-1 && com!=-1) {
				System.out.println("Valid Email ID");
			}
			else {
				System.out.println("Invalid Email ID!");
			}
				
		}
		return obj;
		
	}
	
	private static DisplayCustomer validateEmailUserInput(DisplayCustomer customer) {

			int atTheRate = customer.getEmail().indexOf("@");
			int com = customer.getEmail().indexOf(".com");
			System.out.println(customer);
			
			if(atTheRate !=-1 && com!=-1) {
				System.out.println("Valid Email ID");
			}
			else {
				System.out.println("Invalid Email ID!");
			}
				
		
		return customer;
		
	}

}