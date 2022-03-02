/*

Program: Accounts.java          Last Date of this Revision: feb 21, 2022

Purpose: an object that has the geral chratistics of a bank acount without any specifics

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/



package Accounts;
import java.text.NumberFormat;


public class Account extends Customer {

	
	private double balance; // initalizing a balance vaiable
	
	
	public Account(double bal, String fName, String lName, String str, String city, String pro, String zip) { //constructor method
		super(fName, lName, str, city, pro, zip);
		balance = bal;
	}
	

	public double getBalance() { //returns the current blanance
	 	return(balance);
	}


	
	public void deposit(double amt) { // adding to the balance
	 	balance += amt; // adding the amount
	}

	
	
	public void withdrawal(double amt) { // taking out money
	 	if (amt <= balance) {
	 		balance = balance - amt; // taking out the money 
	 	} else {
	 		System.out.println("Not enough money in account."); //not enogh money to get take it out
	 	}
	}
	
	public void tax(double loserMoney) { //takes away a variable amount for vairing
		balance = balance - loserMoney; //taking away money if you need to be taxed
	}
	
	
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = super.toString(); //using the tostring method thing in Customer to get a large portion of the string
		accountString += "Current balance is " + money.format(balance); //money is somthing to make it look nice
	 	return(accountString);
	}
}
	
	
	





