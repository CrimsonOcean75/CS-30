/*

Program: client_testing_code.java          Last Date of this Revision: feb 21, 2022

Purpose: code that test all the clients out to insure they are functional.

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/

package Accounts;

import java.util.Scanner;

public class client_testing_code {

	public static void main(String[] args) {
		// TODO Auto-generated
		@SuppressWarnings("unused") //making it shut up
		
		double get, get1;

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("testing out the Buisness account \n");
		
		
		BuisnessAccount blurb = new BuisnessAccount(600, "Greg", "Johns", "dead ave", "deadmenton", "Alberta", "T2N Ded" );
		
		System.out.println(blurb.toString());
		
		System.out.println("enter the amount you want to withdraw: ");
		get = input.nextDouble();
		blurb.withdrawal(get);
		System.out.println("new balance: " + blurb.getBalance());
		
		
		
		
		System.out.println("\n\n");
		
		
		
		System.out.println("testing out the personal account\n");
		
		PersonalAccount blab = new PersonalAccount(200, "blab", "thomash", "alive ave", "clagary", "Alberta", "T2N Dalive" );
		
		System.out.println(blab.toString());
		
		System.out.println("enter the amount you want to withdraw: ");
		get1 = input.nextDouble();
		blab.withdrawal(get1);
		System.out.println("new balance: " + blab.getBalance());
		
		
		input.close(); // <--- my WaterMark
		
	}

}

/* Screen Dump
Greg Johns
dead ave
deadmenton, Alberta  T2N Ded
Current balance is $600.00
enter the amount you want to withdraw: 
100
new balance: 500.0



testing out the personal account

blab thomash
alive ave
clagary, Alberta  T2N Dalive
Current balance is $200.00
enter the amount you want to withdraw: 
110
YOU'VE BEEN TAXED ($2). Your new balance is: 88.0
new balance: 88.0
 */






