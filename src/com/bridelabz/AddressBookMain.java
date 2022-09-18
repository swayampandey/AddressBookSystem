package com.bridelabz;

import java.util.*;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
	//	AddressBook addressbook = new AddressBook();
		HashMap<String, AddressBook> addressBookHashMap = new HashMap<String, AddressBook>();
		Scanner sc = new Scanner(System.in);
		
		int operationNo;
		
		do {
		System.out.println("Welcome to Address Book Program");
		System.out.println("1. ADD CONTACT\n2. DISPLAY CONTACT\n3. EDIT CONTACT \n4. DELETE CONTACT\n5. ADD NEW ADDRESS BOOK"
				+ "\n6. DISPLAY AVAILABLE ADDRESS BOOKS\n7. DISPLAY ALL ADDRESS BOOKS\n8. EXIT");
		System.out.println("Enter the operation number :");
		operationNo = sc.nextInt();
		
		switch(operationNo) {
		
		case 1:
			System.out.println("Enter the address book name to add contact in that address book : ");
			String addressBookName = sc.next();
			if(!addressBookHashMap.containsKey(addressBookName)) {
				System.out.println("Address book not exists !");
			}
			else {
				AddressBook addressBook =addressBookHashMap.get(addressBookName);
				addressBook.addContact();
			}
			break;
		case 2:
			System.out.println("Enter the address book name to display contacts in that address book : ");
			String addressBookName1 = sc.next();
			if(!addressBookHashMap.containsKey(addressBookName1)) {
				System.out.println("Address book not exists !");
			}
			else {
				AddressBook addressBook =addressBookHashMap.get(addressBookName1);
				addressBook.displayContact();
			}
			break;
		case 3:
			System.out.println("Enter the address book name to edit contacts in that address book : ");
			String addressBookName2 = sc.next();
			if(!addressBookHashMap.containsKey(addressBookName2)) {
				System.out.println("Address book not exists !");
			}
			else {
				AddressBook addressBook =addressBookHashMap.get(addressBookName2);
				addressBook.editContact();
			}
			break;
		case 4:
			System.out.println("Enter the address book name to delete contacts in that address book : ");
			String addressBookName3= sc.next();
			if(!addressBookHashMap.containsKey(addressBookName3)) {
				System.out.println("Address book not exists !");
			}
			else {
				AddressBook addressBook =addressBookHashMap.get(addressBookName3);
				addressBook.addContact();
			}
			break;
		case 5:
			System.out.println("Enter the address book name : ");
			String name= sc.next();
			if(!addressBookHashMap.containsKey(name)) {
				System.out.println("Address book already exists !");
			}
			else {
				AddressBook addressBook = new AddressBook();
				addressBookHashMap.put(name, addressBook);
			}
			break;
		case 6:
			Set<String> keys = addressBookHashMap.keySet();
			if(keys.isEmpty()) {
				System.out.println("No address book is available ! ");
			}
			for(String str : keys) {
				System.out.print(str +" ");
			}
			break;
		case 7:
			Set<Map.Entry<String, AddressBook>> addressBook = addressBookHashMap.entrySet();
			if(addressBook.isEmpty()) {
				System.out.println("Address book does not exists !");
			}
			for(Map.Entry entry : addressBook) {
				System.out.println(entry.getKey());
				AddressBook addBook = (AddressBook) entry.getValue();
				addBook.deleteContact();
			}
			break;
		default:
			System.out.println("Wrong Operation Number ");
			break;
			
		}
		
		
		} while(operationNo != 7);
		
	}
}
