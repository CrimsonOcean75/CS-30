/*

Program: squares.java          Last Date of this Revision: april 19, 2022

Purpose: a program that takes an array and turns it into squares of that width

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/


package squares;

public class squares {

	public static void main(String[] args) {
		
		
	int[] wasd = new int[5];
		
		for (int n = 0; n < wasd.length; n++) 
		
		{
			int s = n * n;
			wasd[n] = s;
			System.out.println(wasd[n]);
		}
		
		
	}

}

/* screen dump
0
1
4
9
16

*/