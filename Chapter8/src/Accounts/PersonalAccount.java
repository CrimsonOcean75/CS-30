/*

Program: personalAccount.java          Last Date of this Revision: feb 21, 2022

Purpose:an personal Account that extends account to add more specific aspects of a personal account

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package Accounts;

public class PersonalAccount extends Account {

	
	
	
	
	
	public PersonalAccount(double bal, String fName, String lName, String str, String city, String pro, String zip) { // constructor method 
		super(bal, fName, lName, str, city, pro, zip); //Super the something, basically just a regular account but it adds a text method
		
	}
	
	public void withdrawal(double amtount) {
		
		super.withdrawal(amtount); //this is going to account to get the balance and it says no if you don't have enough
		
		if (super.getBalance()< 100) { //checking the balance after the amount has been withdrawn and if its lower then 500 make them PAY
			
			super.tax(2); // taking away ten dollars if you went bellow five hundred
			System.out.println("YOU'VE BEEN TAXED ($2). Your new balance is: " + super.getBalance());
		}
	}
	
	
	
}
