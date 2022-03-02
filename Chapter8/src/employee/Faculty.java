/*

Program: Faculty.java          Last Date of this Revision: feb 22, 2022

Purpose: a Faculty class that extends uemployee and adds a department

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package employee;

public class Faculty extends UEmployee {

	
	private String department;
	
	public Faculty(String N, double S, String D) { // N = name S, = salary, D = department
		super(N,S);
		department = D;
		
	}
	
	public void setDepartment(String de) { // a method for seting the department name
		department = de; 
	}
	
	public String getDepartment() { // a method for returning the department
		return department;
	}
	
	
	
	
	
}
