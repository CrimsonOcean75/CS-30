/*

Program: Roster.java          Last Date of this Revision: april 19, 2022

Purpose: a program that asks the user for some amount of students first and last names and then writes the data to a file

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/




package roster;







import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;







public class Roster {
    
    public static void main(String[] args) throws Exception {
        
                String userfile;
                int numbwerof ;
                int n = 0;
                String name = "";
                String sco = "";
                boolean flag1 = false;
                boolean flag2 = false;
        
		Scanner input = new Scanner(System.in);
		 
                
                
                
                 System.out.println("enter the file that you want to right score values to");
		 
		 userfile =  input.nextLine();
		 
                
                
		 File stuFile = new File("../Chapter11/src/statsP2/" + userfile + ".txt");

        try {
            /* write objects */
            FileOutputStream out = new FileOutputStream(stuFile);
            ObjectOutputStream writeStu = new ObjectOutputStream(out);
            
            
            
            System.out.println("enter the number of students you want to enter");
		 numbwerof = input.nextInt();
		 input.nextLine(); //eating \n
                 
                 
                 String[] arrNew = new String[numbwerof];
                 int startFromTheBottemNowWeHere = 0;
                 
                  while (n < numbwerof*2) { //while the loop counter is lesthen 2 times the number of students (2 x because you need to write scores and names) 
		 
			 
			 
			 
			 if (n %2 == 0) { //runs this one first 
				 
				 System.out.println("enter the students first name: ");
				 name = input.nextLine();
				 flag1 = true;
				 
				 
			 }
			 
			  if (n % 2 != 0 ){ //runs this one second then alternates between them as n is incremented
				 System.out.println("enter the students last name: ");
				 sco = input.nextLine();
                                 
				 flag2 = true;
				 
			 }
                          
                          
                          if ( flag1 == true && flag2 == true){
                              flag1 = false;
                              flag2 = false;
                              
                              writeStu.writeObject(new Student(name, sco));
                              arrNew [startFromTheBottemNowWeHere] = (name + " " + sco);
                              startFromTheBottemNowWeHere += 1;
                          }
			 
			  
			 n = n + 1; 
			 
		 }
                 
                  
                  System.out.println( "\n\n");
                  
                  int f =0;
                  
                  while ( f <= arrNew.length - 1) {
                      
                      System.out.println( arrNew[f]);
                      f +=1;
                  }
                 
                 
                 
            
            writeStu.close();
            
            
            
            
            System.out.println("Data written to file.");
               
            
            
            /* read objects */
            FileInputStream in = new FileInputStream(stuFile);
            ObjectInputStream readStu = new ObjectInputStream(in);
            Student stu1 = (Student)readStu.readObject();
            Student stu2 = (Student)readStu.readObject();
            readStu.close();

            //System.out.println(stu1);
            //System.out.println (stu2);

            
            
            
 }
        catch (FileNotFoundException e) {
 System.out.println("File could not be found.");
 System.err.println("FileNotFoundException: "
 + e.getMessage());
 } 
        
        catch (IOException e) {
 System.out.println("Problem with input/output.");
 System.err.println("IOException: " + e.getMessage());
 } 
        
        catch (ClassNotFoundException e) {
 System.out.println("Class could not be used to cast object.");
 System.err.println("ClassNotFoundException: "
 + e.getMessage());
 }
		 input.close();
	}

    
    
}



/*screen dump
 * 
 * 
 * 
 * enter the file that you want to right score values to
tood
enter the number of students you want to enter
3
enter the students first name: 
tim
enter the students last name: 
tim
enter the students first name: 
tom
enter the students last name: 
tom
enter the students first name: 
dead
enter the students last name: 
dead



tim tim
tom tom
dead dead
Data written to file.
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
 */


