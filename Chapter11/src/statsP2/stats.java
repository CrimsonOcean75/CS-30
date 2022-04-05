package statsP2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class stats {

	public static void main(String[] args) {
		File scores = new File("../Chapter11/src/statsP1/scores.txt");
		 FileReader in;
		 BufferedReader readFile;
		 String score; // a string for the line that comes in that will be converted into a double
		 double avgScore; // what will reperesnt the average
		 double totalScores = 0; //total of all scores in file
		 int count = 1; // number of scores in file
		 int numScore=0;
		 
		 
        //foramt for the file to be read must be name first then score
		 try {
		 in = new FileReader(scores);
		 readFile = new BufferedReader(in);
		 int highLow[] = {}; //array to be appened by the users imputs
		 
		 
		 //make the file and put the values in
		 
		 
		 
		 
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

		 
		 
		 readFile.close();
		 in.close();
		 } 
		 
		 catch (IOException e) {
		 System.out.println("Problem reading file.");
		 System.err.println("IOException: " + e.getMessage());
		 }
	}

}
