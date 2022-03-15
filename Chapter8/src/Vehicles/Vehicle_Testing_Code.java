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

	public static void main(String[] args) { // this java file tests out the vehicle objects by using there methods 
		
		Scanner input = new Scanner(System.in);
		int cho; // Variables for users choice
		
		
		
		Car HondaCiv = new Car(4, 17.0, true, "red", false, 4, true);
		
		System.out.println("The car you have " + HondaCiv.isCivicString() +". And it's colour is " + HondaCiv.getColour() + "."); // Printing select aspects of your car
		
		
		System.out.println("do you want to check your vehicle's fulids? (1 for yes 2 for no)"); // asking if you want to check the vehicles fluid level
		
		cho =  input.nextInt();
		input.close();
		
		if (cho == 1) {
			
			
			if(HondaCiv.getfulid() == true) { // if statement based off or weather not your vehicles  
				System.out.println("your vehicle's fluid is full"); //full
			}
			else {
				System.out.println("your vehicle's fluid is not full"); //not full
			}

	
}
}
}

/*screen dump
 * 
 * The car you have is a civic. And it's colour is red.
   do you want to check your vehicle's fulids? (1 for yes 2 for no)
   1
   your vehicle's fluid is full
 * 
 * 
 * 
 * 
 */





