/*

Program: circle.java          Last Date of this Revision: feb 20, 2022

Purpose:an object that models various aspects of a circle

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/




package Puck_1_spot;

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

			 
			 public double getRadius()  //a method for geting the radius
			 {
				 return(radius);
			 }
		}

	
	
	
	
	

