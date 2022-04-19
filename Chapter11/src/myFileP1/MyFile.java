/*

Program: MyFile.java          Last Date of this Revision: april 19, 2022

Purpose: checks if a file exists or not

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/





package myFileP1;

import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyFile {

	private JFrame frame;
	private JTextField UFilein;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFile window = new MyFile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 486, 169);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		UFilein = new JTextField();
		UFilein.setBounds(10, 72, 267, 30);
		UFilein.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				UFilein.setText("");
			}
		});
		frame.getContentPane().setLayout(null);
		UFilein.setText("Enter the file you wish to check");
		UFilein.setToolTipText("Enter the File you wish to check");
		frame.getContentPane().add(UFilein);
		UFilein.setColumns(10);
		
		JLabel nothingBox = new JLabel("File to be checked:");
		nothingBox.setBounds(10, 11, 267, 30);
		frame.getContentPane().add(nothingBox);
		
		JLabel resultBox = new JLabel("");
		resultBox.setBounds(314, 72, 155, 30);
		frame.getContentPane().add(resultBox);
		
		JButton Check = new JButton("Check File");
		Check.setBounds(314, 15, 155, 23);
		Check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				//the file that works here is "no.txt" 
				
				File textFile = new File("../Chapter11/src/myFileP1/" + UFilein.getText()); // the test file is in myFileP1  this first part is the first part of the reliative path.
				
				if (textFile.exists()) {
					resultBox.setText("the file exists");
				}
				else {
					resultBox.setText("the file does not exist");
				}
				
				
				
			}
		});
		frame.getContentPane().add(Check);
	}
}
