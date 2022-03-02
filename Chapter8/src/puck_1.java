


/*

Program: puck_1.java          Last Date of this Revision: feb 20, 2022

Purpose:an object that extends Disk and adds more methods to find out what kind of hockey puck it is

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/
public class puck_1 extends Disk {



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private double weight;
	
	private boolean standard = false; // starting two booleans to see if the puck is a standard puck or a youth puck
	
	private boolean youth = false;
	
	private boolean other = false;
	
	
	
	
	public puck_1(double w) {  // format for using puck_1 is puck_1( radius of puck, thickness of puck , weight of puck)
		super(1.5, 1);  //bringing in radius and thickness i think i might want super(1.5 , 1() cause the textbook says all pucks are 3 od and 1 highet
		weight = w; //adding weight
		// TODO Auto-generated constructor stub
	}

	public void getDivision() {
		
		
		
		if (weight >= 5 && weight<=5.5) { //might seem like bloat code now but it is usefull later for compairing stuff
			standard = true;
			System.out.println("the puck is a standard division"); //printing its standard and also setting a flag saying its standared for latter
		}
		else if(weight>=4 && weight<= 4.5) {
			youth = true;
			System.out.println("the puck is a youth division");//printing its youth and also setting a flag saying its youth for latter
		}
		else{
			other = true ;
			System.out.println("the puck is of an unknown division");//printing its other and also setting a flag saying its other for latter
		} 
		
		
		
		//returning nothing so it doesn't error
	}
	
	public double getWeight() {
		return(weight); //returns the weight of the puck
	}
	
}