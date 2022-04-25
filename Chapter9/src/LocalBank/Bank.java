/*

Program: Bank.java          Last Date of this Revision: april 25, 2022

Purpose: an object that takes user data in and makes and account (also crashes the global economy in 1939 and 2008, and probably in the near future)

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package LocalBank;



import java.util.ArrayList; 
import java.util.Scanner;


public class Bank {

	
	
	private ArrayList<Account> accounts;
	
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	
	@SuppressWarnings("resource")
	public void addAccount() 
	{
		Account newAcct;
		double bal;
		String fName, lName, stre, cit, stat, zip;

		Scanner input = new Scanner(System.in);
		
		System.out.print("First name: ");
		fName = input.nextLine();

		System.out.print("Last name: ");
		lName = input.nextLine();
		
		System.out.print("Street: ");
		stre = input.nextLine();

		System.out.print("City: ");
		cit = input.nextLine();

		System.out.print("State: ");
		stat = input.nextLine();

		System.out.print("ZIP Code: ");
		zip = input.nextLine();

		System.out.print("Beginning balance: ");
		bal = input.nextDouble();
		
		newAcct = new Account(bal, fName, lName, stre, cit, stat, zip); 
		accounts.add(newAcct);			
		
		System.out.println("Account created. Account ID is: " + newAcct.getID());
	}

	public void deleteAccount(String acctID) {
		int acctIndex;
		Account acctToMatch;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
	 	if (acctIndex > -1) {
	 		accounts.remove(acctIndex);					//remove account
	 		System.out.println("Account removed.");
	 	} else {
	 		System.out.println("Account does not exist.");
	 	}
	}
	
	public void transaction(int transCode, String acctID, double amt) {
		int acctIndex;
		Account acctToMatch, acct;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
	 	if (acctIndex > -1) {
	 		acct = accounts.get(acctIndex);				//retrieve object to modify
	 		if (transCode == 1) {
	 			acct.deposit(amt);
	 			accounts.set(acctIndex, acct);		//replace object with updated object
	 			System.out.println(acct);
	 		} else if (transCode == 2) {
	 			acct.withdrawal(amt);
	 			accounts.set(acctIndex, acct);		//replace object with updated object
	 			System.out.println(acct);
	 		}
	 	} else {
	 		System.out.println("Account does not exist.");
	 	}
	}

	public void checkBalance(String acctID) {
		int acctIndex;
		Account acctToMatch, acct;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
	 	if (acctIndex > -1) {
	 		acct = accounts.get(acctIndex);	//retrieve object to display
	 		System.out.println(acct);
	 	} else {
	 		System.out.println("Account does not exist.");
	 	}
	}

	 	public void modifyAccount(String acctID) {
	 		Account acctToMatch, acct;
	 		acctToMatch = new Account(acctID);
	 		int acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
	 		if(acctIndex > -1) {
	 			  acct = accounts.get(acctIndex);
	 			  
	 			  String stre, cit, stat, zip;
	 			 Scanner input = new Scanner(System.in);
	 			  
	 			 System.out.print("Street: ");
	 			stre = input.nextLine();

	 			System.out.print("City: ");
	 			cit = input.nextLine();

	 			System.out.print("State: ");
	 			stat = input.nextLine();

	 			System.out.print("ZIP Code: ");
	 			zip = input.nextLine();
	 			  
	 			  acct.changeAddress(stre, cit, stat, zip);
	 			  input.close();
	 		} else {
	 			System.out.println("Account does not exist");
	 		}
	 	}

	
	
	
	
}
