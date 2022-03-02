package Puck_2_spot;

public class Circle {

	
	//Setting up the class with private variables for internal calculation
			
				private static final double PI = 3.14;
				private double radius;

			//Circle constructor
			 public Circle(double r) 
			 {
				 radius = r;
			 }
			 
			 
			 
			 
			 
			 
			 
			 //Method for changing the radius of the circle
			 public void setRadius(double newRadius) 
			 {
				 radius = newRadius;
			 }
			 
			 //Double method for calculating the area of the circle
			 public double area() 
			 {
				 double circleArea;
				 circleArea = PI * radius * radius;
				 return(circleArea);
			 }

			 //Method for retrieving the area of the circle
			 public double getRadius() 
			 {
				 return(radius);
			 }
		}

	
	
	
	
	

