/*

Program: circle.java          Last Date of this Revision: feb 20, 2022

Purpose:an object that models various aspects of a circle

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/




package Puck_1_spot;

public class Circle {

	
	//Setting up the class with private variables for internal calculation
			
				private static final double PI = 3.14;
				private double radius;

			//Circle constructor
			 public Circle(double r) 
			 {
				 radius = r;
			 }
			 
			 
			 
			 
			 
			 
			 
			 //a method for seting the radius
			 public void setRadius(double newRadius) 
			 {
				 radius = newRadius;
			 }
			 
			 //a method that calculates and returns area
			 public double area() 
			 {
				 double circleArea;
				 circleArea = PI * radius * radius;
				 return(circleArea);
			 }

			 //a method for geting the radius
			 public double getRadius() 
			 {
				 return(radius);
			 }
		}

	
	
	
	
	

