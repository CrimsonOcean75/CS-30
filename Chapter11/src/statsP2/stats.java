/*

Program: stats.java          Last Date of this Revision: april 12, 2022

Purpose: An application that creates a file based on user input then writes user inputed names and scores to a txt file and outputs information about the scores

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/




package statsP2;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class stats {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 FileReader in;
		 BufferedReader readFile;
		 FileWriter out;
		 BufferedWriter writeFile;
		 PrintWriter pw;
		 
		 
		 String score; // a string for the line that comes in that will be converted into a double
		 double avgScore; // what will reperesnt the average
		 double totalScores = 0; //total of all scores in file
		 int count = 1; // number of scores in file
		 int numScore=0;
		 String userfile ;
		 int todd =1 ;
		 int numbwerof ;
		
		 
        //foramt for the file to be read must be name first then score
		 try {
		
		 
		 
		 
		 //make the file and put the values in
		 
		 
		 
		 System.out.println("enter the file that you want to right score values to");
		 
		 userfile =  input.nextLine();
		 
		 
		 
	    
		 File scores = new File("../Chapter11/src/statsP2/" + userfile + ".txt"); //user should enter somthing like soreces.txt
		 
		 
		 
		 try {//make the file and put the values in
			  
	            // if it does not exist
	            if (scores.createNewFile()) //not an actual file its a file object representing a file
	                System.out.println("File created");
	            else //if it exists
	                System.out.println("File already exists");
	        }
	        catch (Exception e) {
	            System.err.println(e);
	        }
		 
		 
		
		 String name_sco = "";
		 int n = 0;
		 
		 in = new FileReader(scores);
		 out = new FileWriter(scores);
		 readFile = new BufferedReader(in);
		 writeFile = new BufferedWriter(out);
		 pw = new PrintWriter(writeFile);
		 
		 System.out.println("enter the number of students you want to enter");
		 numbwerof = input.nextInt();
		 input.nextLine(); //eating \n
		 
		 int[] arrNew = new int[numbwerof];
		 int startFromTheBottemNowWeHere = 0;
		 
		 
		 while (n < numbwerof*2) { //while the loop counter is lesthen 2 times the number of students (2 x because you need to write scores and names) 
		 
			 
			 
			
			 
			 
			 if (n %2 == 0) { //runs this one first 
				 
				 System.out.println("enter the students name: ");
				 name_sco = input.nextLine();
				 
				 pw.println(name_sco); //writing to the file
				 pw.flush();
				 
			 }
			 
			  if (n % 2 != 0 ){ //runs this one second then alternates between them as n is incremented
				 System.out.println("enter the students score: ");
				 name_sco = input.nextLine();
				 arrNew [startFromTheBottemNowWeHere] = (int)Double.parseDouble(name_sco); //it's like god wrote this code
				 pw.println(name_sco); //writing to the file
				 pw.flush();
				 startFromTheBottemNowWeHere = startFromTheBottemNowWeHere+ 1;
				 
			 }
			 
			  
			 n = n + 1; 
			 
		 }
		 
		 
		 
		
		 
		 
		 
		 
		 
		 while ((score = readFile.readLine()) != null ) { //read the file and do the averages and stuff
			 
		
			 if(count % 2 ==0 ) { //if count is even
			 
				 totalScores += Double.parseDouble(score); //adding to the total score if the line is a score line
		 
		 
		
		 
				 System.out.println(score); //print ln to get to next line
				 numScore += 1;
				 
			 }
		 
			 else {
				System.out.print(score + " got a: "); //printing the name and staying on the same line
			 }
			 count += 1;
		 
		 	}
		 
		 //after the while loop is done then it outputs the average
		 avgScore = totalScores / numScore;
		 System.out.println("Average was: " + avgScore);
		
		 Arrays.sort(arrNew); //sort the users imputs 
		 
		 System.out.println("Minimum = " + arrNew[0]);
		
		 
		 System.out.println("Maximum = " + arrNew[arrNew.length-1]); //print the highest 

		 
		 writeFile.close();
		 readFile.close();
		 out.close();
		 in.close();
		 
		 } 
		 
		 catch (IOException e) {
			 System.out.println("Problem reading file.");
			 System.err.println("IOException: " + e.getMessage());
		 }
		 input.close();
	}

}

/* screen dump
 * 
 * 
 * 
 * enter the file that you want to right score values to
Gloobed
File created
enter the number of students you want to enter
4
enter the students name: 
tom
enter the students score: 
50
enter the students name: 
jimbo
enter the students score: 
100
enter the students name: 
billy
enter the students score: 
50
enter the students name: 
jermimia
enter the students score: 
100
tom got a: 50
jimbo got a: 100
billy got a: 50
jermimia got a: 100
Average was: 75.0
Minimum = 50
Maximum = 100
 * 
 * 
 * 
 * 
 * 
 */



