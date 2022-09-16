package com.bridelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	// creating instance object
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Contact> contactArrayList = new ArrayList<>();
	
	public void addContact() {
		
		Contact contact = new Contact();
		System.out.println("Enter the first name : ");
		contact.setFirstName(sc.next());
		System.out.println("Enter the last name : ");
		contact.setLastName(sc.next());
		System.out.println("Enter the address : ");
		contact.setAddress(sc.next());
		System.out.println("Enter city : ");
		contact.setCity(sc.next());
		System.out.println("Enter state : ");
		contact.setState(sc.next());
		System.out.println("Enter zipcode : ");
		contact.setZip(sc.nextInt());
		System.out.println("Enter mobile number : ");
		contact.setPhoneNum(sc.nextLong());
		System.out.println("Enter email id : ");
		contact.setEmailId(sc.next());
		contactArrayList.add(contact);
	}
	public void displayContact() {
		for(int i = 0; i < contactArrayList.size(); i++) {
			Contact contact = contactArrayList.get(i);
			System.out.println(contact.toString());
		}
	}

}
