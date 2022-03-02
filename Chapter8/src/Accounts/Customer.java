/*

Program: CustomerAccount.java          Last Date of this Revision: feb 21, 2022

Purpose:and object that descibes all the detials of a customer (first name, last name.. ect)

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/

package Accounts;

public class Customer {

private String firstName, lastName, street, city, province, zip;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String c, String pro, String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		province = pro;
		zip = z;
	}
	

	/**
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	 public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + province + "  " + zip + "\n";
	 	return(custString);
	}
	
	
	
}
