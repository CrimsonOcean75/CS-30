/*

Program: Disk.java          Last Date of this Revision: feb 20, 2022

Purpose:an object that models various aspects of a disk

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/





package Puck_1_spot;

public class Disk extends Circle {

	
	
	private double thickness; // a varible for thcikness

	
	
	
	
	public Disk(double r, double t) //constructor
	{
		super(r); // a circle with radius r
		thickness = t;
	}

	
	
	
	
	public void setThickness(double newThickness) //a method changes thickness
	{
		thickness = newThickness;
	}

	
	
	
	
	
	public double getThickness() //a method that gets the thickness
	{
		return(thickness);
	}

	
	
	
	
	
	public double volume() //a method that calculates and returns volume
	{
		double v; //local volume variable
		
		v = super.area() * thickness;
		
		return v;
	}
	
	
	
	}

