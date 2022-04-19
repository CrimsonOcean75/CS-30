/*

Program: Student.java          Last Date of this Revision: april 19, 2022

Purpose: an object used to write student names

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/



package roster;


import java.io.*;


public class Student implements Serializable {
    
    
    private String stuName;
 private String stuLname;

 /**
 * constructor
 * pre: none
 * post: A Student object has been created.
 * Student data has been initialized with parameters.
 */
 public Student(String name, String Lname) {
 stuName = name;
 stuLname = Lname;
 }
 /**
 * Creates a string representing the student object
 * pre: none
 * post: A string representing the student object
 * has been returned.
 */
 public String toString() {
 String stuString;

 stuString = stuName + " " + stuLname;
 return(stuString);
 }
    
    
}
