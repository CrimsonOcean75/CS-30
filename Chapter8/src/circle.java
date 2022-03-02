/*

Program: circle.java          Last Date of this Revision: feb 20, 2022

Purpose:an object that models various aspects of a circle

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/
public class circle {
	
	
	//an object called circle (not a circle actual circle) that has methods that can get  radius and area
	
	
	private static final double PI = 3.141592653589;
	private double Radius;

	//Radius constructor.
	public   circle(double rad) { //there is no longer a default radius it has to be set when you use circle in your code or else its hates you
	    Radius = rad;
	    
	    
	    
	}

	
	

	

	//Accessor method for the circumference. Also calculates circumference.
	public double getCircumference(double circleCir) {
	    circleCir = 2 * PI * Radius;
	    return circleCir;
	}

	//Accessor method for the radius.
	public double getRadius() {
	    return Radius;
	}

	//Displays the formula for area.
	public static void displayAreaFormula() {
	    System.out.println("The formula for the area of a circle is a = pi * r ^ 2");
	}
	
	public String setRadius(double newRadius) { 
		Radius = newRadius ; 
		return "";
		
		
	}
	
	public double area() {
		return PI * Radius * Radius ;
	}

	
	

	//Strings and returns circleString
	public String toString() {
	    String circleString = "Circle has radius: " +Radius;
	    return(circleString);
	}
}
