/*

Program: UEmployee_Testing_Code.java          Last Date of this Revision: feb 22, 2022

Purpose: code for testing out the UEmployee class and the UEmployee class extensions 

Author: Max Piercey,
School: CHHS
Course: Computer Programming 30


*/


package employee;



import java.util.Scanner;

public class UEmployee_Testing_Code {

	
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String dep;
		String dep1;
		String ti;
		
		
		
			System.out.println("testing just UEmployee\n");
			UEmployee Dave = new UEmployee("Dave", 40000.00); //you can't change your name or salary, the textbook doesn't ask for it
		
			System.out.println("the employees name is: " + Dave.getName()); // getting name
			System.out.println("the employees salray is: " + Dave.getSalary()); //getting salary
		
		
		
		System.out.println("\n\n"); //clearing the line 
		
		
		
			System.out.println("testing out just Faculty\n");
			Faculty David = new Faculty("David", 70000.00, "marketing");
			
			System.out.println("the employees name is: " + David.getName()); // getting name
			System.out.println("the employees salray is: " + David.getSalary()); //getting salary
			System.out.println("the employees department is: " + David.getDepartment()); // getting department
		
			System.out.println("change department to: ");
			dep = input.nextLine(); // getting the next string from user
			David.setDepartment(dep);
			System.out.println("the department has been changed to: " + David.getDepartment() );
		
		
		System.out.println("\n\n"); //clearing the line 
		
		
		
			System.out.println("testing out just Staff\n");
			Staff Davy = new Staff("Davy",  80000.00, "marketing", "firm manager");
		
			System.out.println("the employees name is: " + Davy.getName()); // getting name
			System.out.println("the employees salray is: " + Davy.getSalary()); //getting salary
			System.out.println("the employees department is: " + Davy.getDepartment()); // getting department
			System.out.println("the employees title is: "+ Davy.getTitle());
			
			System.out.println("change department to: ");
			dep1 = input.nextLine(); // getting the next string from user
			Davy.setDepartment(dep1);
			System.out.println("the department has been changed to: " + Davy.getDepartment() );
			
			
			System.out.println("change title to: ");
			ti = input.nextLine(); // getting the next string from user
			Davy.setTitle(ti);
			System.out.println("the title has been changed to: " + Davy.getTitle() );
			
			input.close(); //closing the input
		
		
		
		
		
		
		
	}
	
	
	
}


/* screen dump
 * 
 * 
 * testing just UEmployee

the employees name is: Dave
the employees salray is: 40000.0



testing out just Faculty

the employees name is: David
the employees salray is: 70000.0
the employees department is: marketing
change department to: 
zack contianment
the department has been changed to: zack contianment



testing out just Staff

the employees name is: Davy
the employees salray is: 80000.0
the employees department is: marketing
the employees title is: firm manager
change department to: 
death
the department has been changed to: death
change title to: 
dead
the title has been changed to: dead

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * testing just UEmployee

the employees name is: Dave
the employees salray is: 40000.0



testing out just Faculty

the employees name is: David
the employees salray is: 70000.0
the employees department is: marketing
change department to: 
the bois
the department has been changed to: the bois



testing out just Staff

the employees name is: Davy
the employees salray is: 80000.0
the employees department is: marketing
the employees title is: firm manager
change department to: 
murder managment
the department has been changed to: murder managment
change title to: 
murder lead
the title has been changed to: murder lead

 * 
 */





