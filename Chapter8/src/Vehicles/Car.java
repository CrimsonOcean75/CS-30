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
	
	public Car(int doorNUM, Double wheelD, boolean full, String col, boolean comp, int seat, boolean civ) { // constructor method
		super(doorNUM, wheelD, full, col, comp, seat); // supering Vehicle
		isCivic = civ;
		
	}

	
	
	public boolean isCivic() { //returning true or false to see if your car is a civic
		return(isCivic);
	}
	
	public String isCivicString() { // checks to see if you car is a civic and if it is it tells you it is
		if (isCivic == true) {
			return("is a civic");
		}
		else{
			return("is not a civic");
		}
	}
	
}
