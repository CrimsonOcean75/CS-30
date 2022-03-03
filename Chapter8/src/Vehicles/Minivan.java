/*

Program: Minivan.java          Last Date of this Revision: feb 24, 2022

Purpose: a class that extends Vehicle and add a method to see if your Minivan has a sliding door

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package Vehicles;

public class Minivan extends Vehicle{

	
	private boolean slidingDoor;
	
	public Minivan(int doorNUM, Double wheelD, boolean full, String col, boolean comp,int seat, boolean slide) { // constructor
		super(doorNUM, wheelD, full, col, comp, seat);
		slidingDoor = slide;
		
	}
	
	
	public boolean getSlidingDoor() { // returns true of false based on if your car has a sliding door
		return(slidingDoor);
	}
	
}
