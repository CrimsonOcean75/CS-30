package Puck_2_spot;

public class Disk extends Circle {

	//Setting up class with private thickness variable
	
	private double thickness;

	//Disk constructor
	public Disk(double r, double t) 
	{
		super(r);
		thickness = t;
	}

	//Method for replacing thickness
	public void setThickness(double newThickness) 
	{
		thickness = newThickness;
	}

	//Method for retrieving thickness
	public double getThickness() 
	{
		return(thickness);
	}

	//Method for calculating volume by multiplying area by thickness
	public double volume() 
	{
		double v;
		v = super.area() * thickness;
		return v;
	}
	}



	
	
	
	

