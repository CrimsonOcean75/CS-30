/*

Program: LocalBank.java          Last Date of this Revision: april 25, 2022

Purpose: allows the user to make an account, change and acount, deposit money, withdraw money and delete in an account

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/



package LocalBank;



import java.util.Scanner;


public class LocalBank {

	
	public static void main(String[] args) {
		Bank easySave = new Bank();
		Scanner input = new Scanner(System.in);
		String action;
		String acctID;
		Double amt;

		/* display menu of choices */
		do {
			System.out.println("\nDeposit(D)\\Withdrawal(W)\\Check balance(C)");
			System.out.println("Add an account(A)\\Remove an account(R)");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();

			if (action.equalsIgnoreCase("A")) 
			{
				easySave.addAccount();
			} 
			else if (!action.equalsIgnoreCase("Q")) 
			{
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
				} else if (action.equalsIgnoreCase("W")) {
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);
				} else if (action.equalsIgnoreCase("C")) {
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {
					easySave.deleteAccount(acctID);
				}
				else if (action.equalsIgnoreCase("M")){
						easySave.modifyAccount(acctID);
					
				}
				//write code to modify information if action equals "M"
			}
		} while (!action.equalsIgnoreCase("Q"));
		
		input.close();
	}

	
	
	
	
	
	
	
	
	
}
