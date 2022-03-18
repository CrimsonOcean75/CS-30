package statsP1;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
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
			 int n = 0;
			 boolean goasda = false;
			 
			 
             //foramt for the file to be read must be name first then score
			 try {
			 in = new FileReader(scores);
			 readFile = new BufferedReader(in);
			 int highLow[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //array needs a value to overwirte 
			 
			 while ((score = readFile.readLine()) != null ) {
				 
			
			 if(count % 2 ==0 ) { //if numScores is even
				 
			 totalScores += Double.parseDouble(score); //adding to the total score if the line is a score line
			 
			 
			 if (Double.parseDouble(score) == 0 ) {
				 goasda = true; //setting a flag to fix my latter bad code
			 }
			 
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
			
			 Arrays.sort(highLow);
			 
			
			 boolean goouasg = true;
			 
			 while (goouasg) {
				 
				 if (highLow[n] != 0 && n < highLow.length  ) {
					 
					 if(goasda == false) {
					 System.out.println("Minimum = " + highLow[n]);
					 }
					 else
					 {
						 System.out.println("Minimum = " + "0");
					 }
					 goouasg = false;
				 }
				 
				 n += 1;
			 }
			 
			 System.out.println("Maximum = " + highLow[highLow.length-1]);

			 
			 
			 readFile.close();
			 in.close();
			 } 
			 
			 catch (IOException e) {
			 System.out.println("Problem reading file.");
			 System.err.println("IOException: " + e.getMessage());
			 }
			 
			 
			 } 
	
}





/*screen dump
 * 
 * 
 * steven got a: 67
	billy got a: 80
	dead man who was named mamair got a: 90
	HP office jet printer pro got a: 80
	ben got a: 90
	michale got a: 80
	Average was: 81.16666666666667
	Minimum = 67
	Maximum = 90
 * 
 * 
 * 
 * 
 * 
 * 
 */
