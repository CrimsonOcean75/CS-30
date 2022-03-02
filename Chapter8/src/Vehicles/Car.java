/*

Program: car.java          Last Date of this Revision: feb 24, 2022

Purpose: a car class that extends Vehicle and adds a method to see if your car is a civic

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/

package Vehicles;

public class Car extends Vehicle {
	

	private boolean isCivic;
	
	public Car(int doorNUM, Double wheelD, boolean full, String col, boolean comp, int seat, boolean civ) {
		super(doorNUM, wheelD, full, col, comp, seat);
		isCivic = civ;
		
	}

	
	
	public boolean isCivic() {
		return(isCivic);
	}
	
	public String isCivicString() {
		if (isCivic == true) {
			return("is a civic");
		}
		else{
			return("is not a civic");
		}
	}
	
}
