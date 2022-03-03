/*

Program: Truck.java          Last Date of this Revision: feb 24, 2022

Purpose: a Truck class that extends Vehicle and adds a method to see if your truck has a bedcap on it

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package Vehicles;

public class Truck extends Vehicle {

	
	
	private boolean bedcap;
	
	
	public Truck(int doorNUM, Double wheelD, boolean full, String col, boolean comp,int seat, boolean cap) { // constructor method
		super(doorNUM, wheelD, full, col, comp, seat); //supering vehicle
		bedcap = cap;
		
		
	}
	
	public boolean getCapped() { // retunrns true or false if your truck has a bed cap
		return(bedcap);
	}
	

	
	
	
}
