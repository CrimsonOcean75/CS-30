package statsP1;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;


public class Stats {

	
	
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
			 double highLow[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //array needs a value to overwirte 
			 
			 while ((score = readFile.readLine()) != null ) {
				 
			
			 if(count % 2 ==0 ) { //if numScores is even
				 
			 totalScores += Double.parseDouble(score); //adding to the total score if the line is a score line
			 System.out.println(score); //print ln to get to next line
			 numScore += 1;
			 highLow[count] = Double.parseDouble(score); 
			 }
			 
			 else {
				 System.out.print(score + " got a: "); //printing the name and staying on the same line
			 }
			 count += 1;
			 
			 }
			 
			 //after the while loop is done then it outputs the average
			 avgScore = totalScores / numScore;
			 System.out.println("Average was: " + avgScore);
			
		        
			 //int min = Collections.min(highLow); //working on the min and max
			 //int max = Collections.max(highLow);
			 
			 
			 readFile.close();
			 in.close();
			 } 
			 
			 catch (IOException e) {
			 System.out.println("Problem reading file.");
			 System.err.println("IOException: " + e.getMessage());
			 }
			 
			 
			 } 
	
}
