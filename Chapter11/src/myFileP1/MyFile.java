package myFileP1;

import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		UFilein = new JTextField();
		UFilein.setText("Enter the File you wish to check");
		UFilein.setBounds(10, 72, 267, 30);
		frame.getContentPane().add(UFilein);
		UFilein.setColumns(10);
		
		JLabel nothingBox = new JLabel("File to be checked:");
		nothingBox.setBounds(10, 11, 267, 30);
		frame.getContentPane().add(nothingBox);
		
		JLabel resultBox = new JLabel("");
		resultBox.setBounds(314, 72, 260, 30);
		frame.getContentPane().add(resultBox);
		
		JButton Check = new JButton("Check File");
		Check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File textFile = new File(UFilein.getText()); // the test file is in myFileP1
				
				if (textFile.exists()) {
					resultBox.setText("the file exists");
				}
				else {
					resultBox.setText("the file does not exist");
				}
				
				
				
			}
		});
		Check.setBounds(314, 15, 155, 23);
		frame.getContentPane().add(Check);
	}
}
