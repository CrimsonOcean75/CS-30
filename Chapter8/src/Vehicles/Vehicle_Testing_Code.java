/*

Program: Vehicle_Testing_Code.java          Last Date of this Revision: feb 25, 2022

Purpose: code thats tests Vehicle and car

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/

package Vehicles;

import java.util.Scanner;



public class Vehicle_Testing_Code {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int cho;
		
		//Vehicle(int doorNUM, Double wheelD, boolean full, String col, boolean comp, int seat)
		//(int doorNUM, Double wheelD, boolean full, String col, boolean comp, int seat, boolean civ)
		
		
		Car HondaCiv = new Car(4, 17.0, true, "red", false, 4, true);
		
		System.out.println("The car you have " + HondaCiv.isCivicString() +". And it's colour is " + HondaCiv.getColour() + ".");
		
		
		System.out.println("do you want to check your vehicle's fulids? (1 for yes 2 for no)");
		
		cho =  input.nextInt();
		input.close();
		
		if (cho == 1) {
			
			
			if(HondaCiv.getfulid() == true) {
				System.out.println("your vehicle's fluid is full");
			}
			else {
				System.out.println("your vehicle's fluid is not full");
			}

	
}
}
}
