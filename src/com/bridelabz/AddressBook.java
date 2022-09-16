package com.bridelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook{
	
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
	
	public void editContact() {
		System.out.println("Enter the first name of contact to edit : ");
		String firstName = sc.next();
		
		for(Contact contact : contactArrayList) {
			if(contact.getFirstName().equals(firstName)) {
				System.out.println("Enter the option to edit\n1. First Name\n2. Last Name\n3. Address\n4. City \n5. State\n6. Zip Code\n7. Mobile Number\n8. Email Id");
				int option = sc.nextInt();
				
				switch(option) {
				case 1 :
					System.out.println("Enter new first name : ");
					contact.setFirstName(sc.next());
					System.out.println("first name updated successfully !! ");
					break;
				case 2 :
					System.out.println("Enter new last name :");
					contact.setLastName(sc.next());
					System.out.println("last name updated successfully !! ");
					break;
				case 3 :
					System.out.println("Enter new address : ");
					contact.setAddress(sc.next());
					System.out.println("address updated successfully !! ");
					break;
				case 4:
					System.out.println("Enter new city :");
					contact.setCity(sc.next());
					System.out.println("city updated successfully !! ");
					break;
				case 5:
					System.out.println("Enter new state : ");
					contact.setState(sc.next());
					System.out.println("state updated successfully !! ");
					break;	
				case 6:
					System.out.println("Enter new zip code : ");
					contact.setZip(sc.nextInt());
					System.out.println("zip code updated successfully !! ");
					break;
				case 7:
					System.out.println("Enter new mobile number : ");
					contact.setPhoneNum(sc.nextLong());
					System.out.println("mobile number updated successfully !! ");
					break;
				case 8:
					System.out.println("Enter new email id : ");
					contact.setEmailId(sc.next());
					System.out.println("email id updated successfully !! ");
					break;
				default :
					System.out.println("invalid input");
				}
				return;
			}
			System.out.println(firstName+ " not found ");
		}
	}
	
	public void deleteContact() {
		System.out.println("Enter the name of the person to delete");
		String name = sc.next();
		for( Contact contact : contactArrayList ) {
			if(contact.getFirstName().equals(name) || contact.getLastName().equals(name)){
				contactArrayList.remove(contact);
				System.out.println(contact.getFirstName()+ "removed successfully !! ");
				return;
			}
		}
		System.out.println(name+ " not found");
	}

}
