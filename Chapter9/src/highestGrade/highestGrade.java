/*

Program: highestGrade.java          Last Date of this Revision: april 19, 2022

Purpose: takes the users inputed grades and sorts them, then prints them back out

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package highestGrade;



import java.util.Scanner; 
import java.lang.Math;
import static java.lang.Math.pow;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;

import java.util.List;




public class highestGrade {

	public static void main(String[] args) {
		

		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		System.out.println("Enter student grades: ");
		Scanner input = new Scanner(System.in);
		grades.add( input.nextInt());
		grades.add( input.nextInt());
		grades.add( input.nextInt());
		grades.add( input.nextInt());
		grades.add( input.nextInt());
		input.close();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < grades.size()-1; j++) {
				
				
				
				
				if (grades.get(j).compareTo(grades.get(j+1)) < 0 ) {
					int grade1 = grades.get(j);
					int grade2 = grades.get(j+1);
					grades.set(j, grade2);
					grades.set(j+1, grade1);
				}
			}
		}
		
		System.out.println("the grades ordered are: ");
		
		for (int n = 0; n < grades.size(); n++) {
			System.out.println(grades.get(n));
		}

		
		
		
		
		
		
		
	}

}



/* screen dump
 * 
 * Enter student grades: 
50
80
70
90
100
the grades ordered are: 
100
90
80
70
50
 * 
 * 
 * 
 * 
 * */
