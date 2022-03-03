package Puck_2_spot;

public class Circle {

	
	
			
				private static final double PI = 3.14; //variables for calculation
				private double radius;

			
			 public Circle(double r) //constructor method
			 {
				 radius = r;
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 public void setRadius(double newRadius) //setting the radius
			 {
				 radius = newRadius;
			 }
			 
			
			 
			 
			 public double area() //a method that calculates and returns area
			 {
				 double circleArea;
				 circleArea = PI * radius * radius;
				 return(circleArea);
			 }

			 
			 public double getRadius() //a method for geting the radius
			 {
				 return(radius);
			 }
		}

	
	
	
	
	

