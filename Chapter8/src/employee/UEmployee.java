/*

Program:UEmployee.java          Last Date of this Revision: feb 21, 2022

Purpose: A class that creats a name and salary for an employee

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package employee;

public class UEmployee {

	private String name;
	private double salary;
	
	
	public UEmployee(String N, double S) { //constructor method
		name = N;
		salary = S;
	}
	
	
	
	public String getName() { //a method for returning the name
		return name;  
	}
	
	public double getSalary() { // a method for returning the salary
		return salary;
	}
	
	
	
	
	
}
