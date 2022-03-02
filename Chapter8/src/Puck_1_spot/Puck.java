/*

Program: Puck.java          Last Date of this Revision: feb 20, 2022

Purpose:an object that models various aspects of a circle

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package Puck_1_spot;

public class Puck extends Disk {

	
	
	
	
		private double weight; // a variable for weight of the puck
		
		//constructor
		public Puck(double r, double t, double w) 
		{
			super(r, t); //retrieves r and t variables from the super class Disk
			weight = w;
		}
		
		//Method for setting a new weight for puck.
		public void setWeight(double newWeight) 
		{
			weight = newWeight;
		}

		//Method for retrieving the weight
		public double getWeight() 
		{
			return(weight);
		}
		
		
		
		//Method for finding the division based on the weight of a puck
		public String getDivision(Object p) 
		{
			Puck testPuck = (Puck)p; //Assigns object used in method constructor to new object for comparison
			
			//If statement for differentiating based on weight
			if (testPuck.getWeight() >= 5 && testPuck.getWeight() <= 5.5) 
			{
				return("The puck is standard division");
			} 
			else if (testPuck.getWeight() >= 4 && testPuck.getWeight() <= 4.5)  
			{
				return("The puck is youth division");
			} 
			else 
			{
				return("the puck is a non-standard weight");
			}
		}
		
		//a method that test
		public boolean equals(Object p) 
		{ 
			Puck testPuck = (Puck)p; // makes a new object to compair agains so is the object equal to an object you pass it
			if (testPuck.getRadius() == super.getRadius() && testPuck.getThickness() == super.getThickness() && testPuck.getWeight() == weight) 
			{	// standaered 			youth				stanaderd 					youth 					standared 				youth
				return true; //gives back true if the pucks are equal
			} 
			else 
			{
				return false;
			}
		}
		
		
		public String toString(Object p) 
		{
			Puck strPuck = (Puck)p;
			return("The radius of the puck is " + strPuck.getRadius() + ", the thickness is " + strPuck.getThickness() + ", and the weight is " + strPuck.getWeight() + "\n" + getDivision(strPuck));
		}
	}

	
	
	

