
package object_classes; 

import java.util.Scanner;
import java.lang.Object;

public class circle {

	
	
	//an object called circle (not a circle) that has methods that can get 
	
	
	private static final double PI = 3.141592653589;
	private double Radius;

	//Radius constructor.
	public  circle() {
	    Radius = 1  ;
	    
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

	
	

	//Strings and returns circleString
	public String toString() {
	    String circleString = "Circle has radius: " +Radius;
	    return(circleString);
	}
}
	
	
	public class Disk extends Circle {
		 private double thickness;
		 /**
		 * constructor
		 * pre: none
		 * post: A Disk object has been created with radius r
		 * and thickness t.
		 */
		 public Disk(double r, double t) {
		 super(r);
		 thickness = t;
		 }
		 /**
		 * Changes the thickness of the disk.
		 * pre: none
		 * post: Thickness has been changed.
		 */
		 public void setThickness(double newThickness) {
		 thickness = newThickness;
		 }
		
		
		 /**
		 * Returns the thickness of the disk.
		 * pre: none
		 * post: The thickness of the disk has been returned.
		 */
		 public double getThickness() {
		 return(thickness);
		 }
		 /**
		 * Returns the volume of the disk.
		 * pre: none
		 * post: The volume of the disk has been returned.
		 */
		 public double volume() {
			 double v;
		 
		 
		 v = super.area() *thickness;
		 return(v);
		 
		 }
		
	
	
	}
	

