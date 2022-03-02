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

	//the disk constructor
	public Disk(double r, double t) 
	{
		super(r); // a circle with radius r
		thickness = t;
	}

	
	
	
	//a method that changes the thickness
	public void setThickness(double newThickness) 
	{
		thickness = newThickness;
	}

	
	
	
	
	//a method that gets the thickness
	public double getThickness() 
	{
		return(thickness);
	}

	
	
	
	
	//a method that calculates and returns volume
	public double volume() 
	{
		double v; //local volume variable
		
		v = super.area() * thickness;
		
		return v;
	}
	
	
	
	}

