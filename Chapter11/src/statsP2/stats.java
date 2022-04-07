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
		 int one ;
		 String score; // a string for the line that comes in that will be converted into a double
		 double avgScore; // what will reperesnt the average
		 double totalScores = 0; //total of all scores in file
		 int count = 1; // number of scores in file
		 int numScore=0;
		 String userfile ;
		 boolean writing = true;
		 int todd =1 ;
		 
		 
        //foramt for the file to be read must be name first then score
		 try {
		
		 int highLow[] = {}; //array to be appened by the users imputs
		 
		 
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
		 
		 
		 boolean flag = false; 
		 String name_sco = "";
		 int n = 0;
		 
		 in = new FileReader(scores);
		 out = new FileWriter(scores);
		 readFile = new BufferedReader(in);
		 writeFile = new BufferedWriter(out);
		 pw = new PrintWriter(writeFile);
		 
		 while (writing == true) {
		 
			 
			 
			
			 
			 
			 if (n %2 == 0) { //runs this one first 
				 flag = false; 
				 System.out.println("enter the students name: ");
				 name_sco = input.nextLine();
				 pw.println(name_sco); //writing to the file
				 pw.flush();
				 
			 }
			 
			  if (n % 2 != 0 ){ //runs this one second then alternates between them as n is incremented
				 System.out.println("enter the students score: ");
				 name_sco = input.nextLine();
				 pw.println(name_sco); //writing to the file
				 pw.flush();
				 flag = true;
			 }
			 
			 
			 
			 if (flag == true){
				 System.out.println("if you want to stop adding data enter 1, enter any other number to continue");
				 one = input.nextInt();
				 input.nextLine(); //eats \n
				 
				 if (one == 1) {
					 writing = false; //if the user wants to end it ends the loop 
				 }
				 
			 }
			 
			 n = n + 1; 
			 
			 
		 }
		 
		 
		 
		
		 
		 
		 
		 
		 
		 while ((score = readFile.readLine()) != null ) { //read the file and do the averages and stuff
			 
		
			 if(count % 2 ==0 ) { //if numScores is even
			 
				 totalScores += Double.parseDouble(score); //adding to the total score if the line is a score line
		 
		 
		
		 
				 System.out.println(score); //print ln to get to next line
				 numScore += 1;
				 highLow[count] = (int)Double.parseDouble(score); 
			 }
		 
			 else {
				System.out.print(score + " got a: "); //printing the name and staying on the same line
			 }
			 count += 1;
		 
		 	}
		 
		 //after the while loop is done then it outputs the average
		 avgScore = totalScores / numScore;
		 System.out.println("Average was: " + avgScore);
		
		 Arrays.sort(highLow); //sort the users imputs 
		 
		
		
		 System.out.println("Minimum = " + highLow[0]); //print the lowest 
		 System.out.println("Maximum = " + highLow[highLow.length-1]); //print the highest 

		 
		 writeFile.close();
		 readFile.close();
		 out.close();
		 in.close();
		 
		 } 
		 
		 catch (IOException e) {
			 System.out.println("Problem reading file.");
			 System.err.println("IOException: " + e.getMessage());
		 }
	}

}
