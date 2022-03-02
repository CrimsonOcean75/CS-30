/*

Program: BuisnessAccount.java          Last Date of this Revision: feb 21, 2022

Purpose:an Buisness Account that extends account to add more specifc aspects of a bussines account

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/




package Accounts;

public class BuisnessAccount extends Account{

	
	public BuisnessAccount(double bal, String fName, String lName, String str, String city, String pro, String zip) {
		super(bal, fName, lName, str, city, pro, zip);
		
	}
	
	public void withdrawal(double amtount) {
		
		super.withdrawal(amtount); //this is going to account to get the balance and it says no if you don't have enough
		
		if (super.getBalance()< 500) { //checking the ballance after the amount has been withdrawn and if its lower then 500 make them PAY
			
			super.tax(10); // taking away ten dollars if you went bellow five hundred
			System.out.println("YOU'VE BEEN TAXED ($10). Your new balance is: " + super.getBalance());
		}
	}
	
	
	
	
}
