/*

Program: Divisble_by_three.java          Last Date of this Revision: feb 9, 2019

Purpose: An application that tests to see if a number is divisible by three.

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Divisble_by_three {

	private JFrame frame;
	private JTextField UserIn;
	 
	int userNum ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divisble_by_three window = new Divisble_by_three();
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
	public Divisble_by_three() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 424, 139);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter an Interger:");
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblNewLabel.setBounds(24, 11, 192, 25);
		panel.add(lblNewLabel);
		
		UserIn = new JTextField();
		UserIn.setBounds(206, 12, 168, 20);
		panel.add(UserIn);
		UserIn.setColumns(10);
		
		
		JLabel YesNo = new JLabel("Enter a number to check");
		YesNo.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		YesNo.setBounds(206, 73, 208, 23);
		panel.add(YesNo);
		
		JButton CheckButton = new JButton("Check Divisblity");
		CheckButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) { //when the button is pressed
				String userIn = UserIn.getText();
				UserIn.setText("");
				
				if (userIn != null && !userIn.trim().isEmpty()) { //making sure that there is no case where a null vallue is typecasted otherwise it would error on an empty text field
					  userNum = Integer.parseInt(userIn); //converting the users string to an integer so that we can preferom dvistion on it
					  
					  if (userNum % 3 == 0) {
						  YesNo.setText("The number is divisable by 3");  // the part where it is divisble by 3
					  }
					  else{
						 YesNo.setText("The number is not divisable by 3"); //the case where it is not divisable by three 
					  }
					  
					  
					 // alpha[i] + alpha[n] n incrments all the time but i incrments only when n gets to 26
					  
					 
					}
				
			
				
				
			}
		});
		CheckButton.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		CheckButton.setBounds(24, 73, 150, 23);
		panel.add(CheckButton);
		
		
	}
}
