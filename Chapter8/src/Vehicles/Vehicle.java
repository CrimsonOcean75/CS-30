/*

Program: Vehicle.java          Last Date of this Revision: feb 24, 2022

Purpose: a vehicle class that descibes the basic things on a vehicle

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/



package Vehicles;



//the general class that is inherteted by each kind of subclass of car


public abstract class Vehicle {

	
	private int doorNumber, seating;
	private String  colour;
	private double wheelDiamter;
	private boolean fuildFull, companyOwned;
	
	
	public Vehicle(int doorNUM, Double wheelD, boolean full, String col, boolean comp, int seat) {
		
		doorNumber = doorNUM;
		wheelDiamter = wheelD;
		fuildFull = full;
		colour = col;
		companyOwned = comp;
		seating = seat;
	}
	
	public int getDoorNumber() {
		return(doorNumber);
	}
	
	public double getWheelDiamter() {
		return(wheelDiamter);
	}
	
	public boolean getfulid() {
		return(fuildFull);
	}
	
	public String getColour() {
		return(colour);
	}
	
	public boolean getCompanyOwned() {
		return(companyOwned);
	}
	
	public int getSeating() {
		return(seating);
	}
	
	
	
}
