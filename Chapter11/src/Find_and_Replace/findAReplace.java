package Find_and_Replace;

import java.io.File;
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




public class findAReplace {

	
	static FileWriter out;
	static BufferedWriter writeF;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userfile;
		String phrase;
		String replace;
		FileReader in;
		BufferedReader readFile;
		String n = "";
		
		
		System.out.println("enter the file that you want to search (incude the file extention)");
		 
		userfile =  input.nextLine();
		 
		
		File textFile = new File("../Chapter11/src/Find_and_replace/" + userfile); // the file that the user enters
		
		if (textFile.exists()) {
			System.out.println("the file exists\n");
			System.out.println("enter a search word or phrase: ");
			phrase = input.nextLine();
			System.out.println("enter what you want to replace that word/phrase with: ");
			replace = input.nextLine();
			
			
			
			
			try 
			{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			File textFile_replaced = new File("../Chapter11/src/Find_and_replace/" + "NEW_" + userfile );
			
			out = new FileWriter(textFile_replaced);
			writeF = new BufferedWriter(out);
			
			
			while ((n = readFile.readLine()) != null ) {
			
				n = n.replaceAll(phrase, replace);
				writeF.write(n); //write what n is 
				writeF.newLine(); //put a new line chracter in
				
				
			}
			
			writeF.close();
			out.close();
			readFile.close();
			in.close();
			
			
			
			
			}
			catch(IOException e)
			{
				System.out.println("Error");
			}
			
		}
		else {
			System.out.println("the file does not exist");
			
		}
		
		
		
		

	}

}




/* screen dump
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
