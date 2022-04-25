/*

Program: Customer.java          Last Date of this Revision: april 25, 2022

Purpose: an object that that provides methods

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/



package LocalBank;

public class Customer {

	
	
	private String firstName, lastName, street, city, state, ZIP;

	public Customer(String fName, String lName, String stre, String cit, String sta, String zip) 
	{
		firstName = fName;
		lastName = lName;
		street = stre;
		city = cit;
		state = sta;
		ZIP = zip;
	}
	
	public void changeCity(String newCity) {
		city = newCity;
	}

	public void changeStreet(String newStreet) {
		street = newStreet;
	}

	public void changeState(String newState) {
		state = newState;
	}

	public void changeZIP(String newZIP) {
		ZIP = newZIP;
	}

	public String toString() {
		String custString;

		custString = firstName + " " + lastName + "\n" 
				+ city + "," + state + "\n" 
				+ ZIP;
	 	return(custString);
	}

	
	
	
}
