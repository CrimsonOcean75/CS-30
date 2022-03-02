/*

Program: Disk.java          Last Date of this Revision: feb 20, 2022

Purpose:an object that extends circle and adds new methods that make it more akin to a disk

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/
public class Disk extends circle {

	
	
	/**
	 * Disk class.
	 */
	
	 private double thickness;
	 /**
	 * constructor
	 * pre: none
	 * post: A Disk object has been created with radius r
	 * and thickness t.
	 */
	 public Disk(double r, double t) {
	 super(r); //r takes over radius in circle so that we can use circle in this code
	 thickness = t;
	 }
	 /**
	 * Changes the thickness of the disk.
	 * pre: none
	 * post: Thickness has been changed.
	 */
	 public void setThickness(double newThickness) {
	 thickness = newThickness;
	 }
	
	
	 /**
	 * Returns the thickness of the disk.
	 * pre: none
	 * post: The thickness of the disk has been returned.
	 */
	 public double getThickness() {
	 return(thickness);
	 }
	 
	 
	 /**
	 * Returns the volume of the disk.
	 * pre: none
	 * post: The volume of the disk has been returned.
	 */
	 public double volume() {
		 double v;
	 
	 
	 v = super.area() *thickness;
	 return(v);
	 
	 }
	
	
	
	
	
}
	

