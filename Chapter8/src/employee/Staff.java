/*

Program: Staff.java          Last Date of this Revision: feb 22, 2022

Purpose: a staff class that extends faculty and adds a title

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/

package employee;

public class Staff extends Faculty{ //extending UEmployee

	
	
	
	private String Title;
	
	
	public Staff(String N, Double S, String D, String T) { //constructor method
		super(N,S, D); //supering Faculty
		Title = T; //adding Title variable
	}
	
	public void setTitle(String ti) {
		Title = ti; //taking a users input to change the title
	}
	
	public String getTitle() {
		return Title; //returning the title
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
