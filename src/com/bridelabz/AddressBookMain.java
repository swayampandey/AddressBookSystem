package com.bridelabz;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
		AddressBook addressbook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		
		int operationNo;
		
		do {
		System.out.println("Welcome to Address Book Program");
		System.out.println("1. ADD CONTACT\n2. DISPLAY CONTACT\n3. EDIT CONTACT \n4. DELETE CONTACT\n5. EXIT");
		System.out.println("Enter the operation number :");
		operationNo = sc.nextInt();
		
		switch(operationNo) {
		
		case 1:
			addressbook.addContact();
			break;
		case 2:
			addressbook.displayContact();
			break;
		case 3:
			addressbook.editContact();
			break;
		case 4:
			addressbook.deleteContact();
			break;
		default:
			System.out.println("Wrong Operation Number ");
			break;
			
		}
		
		
		} while(operationNo != 5);
		
	}
}
