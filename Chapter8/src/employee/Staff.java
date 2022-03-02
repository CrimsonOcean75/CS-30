/*

Program: Staff.java          Last Date of this Revision: feb 22, 2022

Purpose: a staff class that extends faculty and adds a title

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/

package employee;

public class Staff extends Faculty{ //getting ti to extend UEmployee

	
	
	
	private String Title;
	
	
	public Staff(String N, Double S, String D, String T) { // N = name, S = salary, D = department, T = title
		super(N,S, D); //making a objet faculty in here
		Title = T; //adding Title 
	}
	
	public void setTitle(String ti) {
		Title = ti; //taking a users imput to change the title
	}
	
	public String getTitle() {
		return Title; //reutnring the title
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
