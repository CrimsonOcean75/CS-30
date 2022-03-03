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
		
		
		public Puck(double r, double t, double w) //constructor
		{
			super(r, t); //supers disk
			weight = w;
		}
		
		
		public void setWeight(double newWeight) // setting the weight
		{
			weight = newWeight;
		}

		
		public double getWeight() // getting the weight
		{
			return(weight);
		}
		
		
		
		
		public String getDivision(Object p) //a  method that gets the divistion of a puck
		{
			Puck testPuck = (Puck)p; //assigns the object that we brought in for compaison
			
			
			
			//if statment that detrimes what division it is and returns it 
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
		
		//a method that tests if two pucks are the same
		public boolean equals(Object p) 
		{ 
			Puck testPuck = (Puck)p; // makes a new object to compair agains so is the object equal to an object you pass it
			if (testPuck.getRadius() == super.getRadius() && testPuck.getThickness() == super.getThickness() && testPuck.getWeight() == weight) 
			{	
				
				
				return true; //gives back true if the pucks are equal
			} 
			else 
			{
				return false; // returns false if the pucks are not equal
			}
		}
		
		
		public String toString(Object p) //printing out all aspects of the puck
		{
			Puck strPuck = (Puck)p;
			return("The radius of the puck is " + strPuck.getRadius() + ", the thickness is " + strPuck.getThickness() + ", and the weight is " + strPuck.getWeight() + "\n" + getDivision(strPuck));
		}
	}

	
	
	

