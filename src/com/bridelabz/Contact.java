package com.bridelabz;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String Address; 
	private String city;
	private String state;
	private int zip;
	private long phoneNum;
	private String emailId;
	
	// constructor
	public  Contact() {} 
		public Contact(String firstName, String lastName, String Address, String city,String state,int zip,long phoneNum, String emailId) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.Address = Address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phoneNum = phoneNum;
			this.emailId = emailId;
			
		}
	
	/*
	 *  assigning the values to variable using setter method 
	 *  taking the values from variable using getter method
	 */
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", Address=" + Address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNum=" + phoneNum + ", emailId=" + emailId + "]";
	}
	
	
	

}
