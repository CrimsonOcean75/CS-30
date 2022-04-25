
/*

Program: search.java          Last Date of this Revision: april 19, 2022

Purpose: an object that helps findName

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/



package findName;

public class Search {

	
	
	
	public static int linearSTR(String[] array, String strToFind) {
		 int index = 0;

		 while ((array[index].equals(strToFind) == false) && (index < array.length - 1)) { //once the index is right it won't change
		 index += 1;
		 }

		 if (array[index].equals(strToFind)) { //if statment beacuse we might not have found it
		 return(index);
		 } else {
		 return(-1);
		 }
		
		 }
	
	
}
