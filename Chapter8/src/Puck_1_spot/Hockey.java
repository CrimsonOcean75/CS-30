/*

Program: Hockey.java          Last Date of this Revision: feb 20, 2022

Purpose: a testing class that tests out the puck object

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/






package Puck_1_spot;

public class Hockey {

	public static void main(String[] args) 
	{
		//intitalize of two puck objects to be tested.
		Puck yPuck = new Puck(1.5, 1.0, 4.5); // the youth puck 
		Puck sPuck = new Puck(2.0, 1.5, 5.5); // the standared puck 
		
		//Printing information on the puck objects using .toString() method.
		System.out.println("The first puck: \n\n" + yPuck.toString(yPuck)); // the second youth puck is like the one that is acually printed
		System.out.println("\nThe second puck: \n\n" + sPuck.toString(sPuck)); // the second standared puck is like the one that is accualy printed
		
		
		if (yPuck.equals(sPuck)) // if the two pucks are equal then printing the pucks are equal
		{
			System.out.println("The pucks are equal.");
		}
		else 
		{
			System.out.println("The pucks are not equal.");
		}
	}

	
}
