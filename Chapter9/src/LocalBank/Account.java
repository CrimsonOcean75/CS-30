/*

Program: Account.java          Last Date of this Revision: april 25, 2022

Purpose: an object that represents a users account

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package LocalBank;

import java.text.NumberFormat;

public class Account {

	private double balance;
	private Customer cust;
	private String acctID;
	
	public Account(double bal, String fName, String lName, String stre, String cit, String stat, String zip)
	 {
		balance = bal;
		cust = new Customer(fName, lName, stre, cit, stat, zip);
		acctID = fName.substring(0,1) + lName;
	}
	
	public Account(String ID) {
		balance = 0;
		cust = new Customer("", "", "", "", "", "");
		acctID = ID;
	}

	public String getID() {
	 	return(acctID);
	}

	public double getBalance() {
	 	return(balance);
	}

	public void deposit(double amt) {
	 	balance += amt;
	}

	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}

	public void changeAddress(String newStreet, String newCity, String newState, String newZIP) {
		cust.changeCity(newCity);
		cust.changeState(newState);
		cust.changeStreet(newStreet);
		cust.changeZIP(newZIP);
	}

	public boolean equals(Object acct) {
		Account testAcct = (Account)acct;
		if (acctID.equals(testAcct.acctID)) {
				return(true);
			} else {
				return(false);
			}
	}

	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = acctID + "\n";
		accountString += cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);
	}

	
	
	
	
	
	
}
