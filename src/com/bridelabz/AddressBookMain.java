package com.bridelabz;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
		AddressBook addressbook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		
		int operationNo;
		
		do {
		System.out.println("Welcome to Address Book Program");
		System.out.println("1. ADD CONTACT \\n2. DISPLAY CONTACT \\n3. EXIT");
		System.out.println("Enter the operation number :");
		operationNo = sc.nextInt();
		
		switch(operationNo) {
		
		case 1:
			addressbook.addContact();
			break;
		case 2:
			addressbook.displayContact();
			break;
		default:
			System.out.println("Wrong Operation Number ");
			break;
			
		}
		
		
		} while(operationNo != 3);
		
	}
}
