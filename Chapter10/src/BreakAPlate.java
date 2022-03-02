/*

Program: BreakAPlate.java          Last Date of this Revision: feb 9, 2019

Purpose: An application that converts plays a game with the suer involing a seires of randomly broken plates. breaking all three wins and breaking 
Another number rewards a consolation prize.

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	double platesChoose ; //the variable that decides how many plates to break 1 = one plate , 2 = two plate , 3 = three plate
	
	/**
	 * Create the application.
	 */
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel PlaceHolder = new JLabel(new ImageIcon("placeholder.gif"));   //place holder stuff
		PlaceHolder.setBounds(170, 158, 89, 92);
		frame.getContentPane().add(PlaceHolder);
		
		
		JLabel plates = new JLabel(new ImageIcon("plates.gif")); //where the plates are stuff
		plates.setBounds(10, 11, 414, 102);
		frame.getContentPane().add(plates);
		
		JButton playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener() {
			
			
			
			
			
			public void actionPerformed(ActionEvent e) { // button press code go here 
				playButton.setText("Play Again?"); // setting to play again the moment the button is pressed
				
				platesChoose = (2-1 +1 ) * Math.random() + 1; //random number
				
				int PlatesChoose = (int)platesChoose; 
				
				if (PlatesChoose == 1) {
					plates.setIcon(new ImageIcon("plates_two_broken.gif")); // just two
					PlaceHolder.setIcon(new ImageIcon("sticker.gif")); // the consolation prize
				}
				else if (PlatesChoose == 2) {
					plates.setIcon(new ImageIcon("plates_all_broken.gif")); // all three
					PlaceHolder.setIcon(new ImageIcon("tiger_plush.gif")); // the winning prize
				}
				
				
				
				
				
				
				
			}
		});
		
		
		
		
		
		playButton.setBounds(157, 124, 114, 23);
		frame.getContentPane().add(playButton);
		
		
		
		
	
	}
}
