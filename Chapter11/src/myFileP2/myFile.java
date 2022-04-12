/*

Program: myFile.java          Last Date of this Revision: april 12, 2022

Purpose: An application that promps a user to keep or delete a created file, amoung other non curicular things

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/



package myFileP2;

import java.awt.EventQueue;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.Timer;




public class myFile {

	private JFrame frame;

	
	// to store current position
    Long currentFrame;
    Clip clip;
      
    // current status of clip
    String status;
      
    AudioInputStream audioInputStream;
    static String filePath = "../Chapter11/src/myFileP2/vine-boom.wav";
  
    
    
    public myFile() 
			throws UnsupportedAudioFileException,
			IOException, LineUnavailableException 
	{
		
    	
    	
    	// create AudioInputStream object
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
          
        // create clip reference
        clip = AudioSystem.getClip();
          
        // open audioInputStream to the clip
        clip.open(audioInputStream);
          
        
        
        
        initialize();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			  
            // if it does not exist
            if (zzztxt.createNewFile())
                System.out.println("File created");
            else //if it exists
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFile window = new myFile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 //Create the application.
	 
	
	 public void stop() throws UnsupportedAudioFileException,
	    IOException, LineUnavailableException 
	    {
	        currentFrame = 0L;
	        clip.stop();
	        clip.close();
	    }
	
	
	public void play() 
    {
        //start the clip
        clip.start();
          
        status = "play";
    }
	
   
  
   
   public static File zzztxt = new File("../Chapter11/src/myFileP2/zzz.txt"); // making a file that can be seen anywhere in the GUI
	
   
   public int inc = 0 ;//to incremenrt inside a timer loop 
   
   
	public void resetAudioStream() throws UnsupportedAudioFileException, IOException,
    LineUnavailableException 
		{
		audioInputStream = AudioSystem.getAudioInputStream(
				new File(filePath).getAbsoluteFile());
		clip.open(audioInputStream);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		}
	
	
	
	
	
	   
	
	 //Initialize the contents of the frame.
	 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 309, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel loadBar = new JLabel();
		loadBar.setBounds(10, 110, 270, 25);
		frame.getContentPane().add(loadBar);
		
		JLabel loadBarPer = new JLabel();
		loadBarPer.setBounds(10, 134, 273, 23);
		frame.getContentPane().add(loadBarPer);
		loadBarPer.setHorizontalAlignment(SwingConstants.CENTER);
		loadBarPer.setVerticalAlignment(SwingConstants.CENTER);
		
		JLabel zzz = new JLabel("A new File named ZZZ.txt has been created,\r\n");
		zzz.setBounds(10, 11, 273, 25);
		frame.getContentPane().add(zzz);
		
		JLabel Keep1 = new JLabel("do you wish to keep this file?");
		Keep1.setBounds(10, 39, 273, 14);
		frame.getContentPane().add(Keep1);
		
		
		
		JButton del = new JButton("delete the file"); //creating the button early
		
		
		JButton keep = new JButton("keep this file");
		keep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Keep1.setText("the file is safe with me"); //setting the test of 1 of the text boxes
				del.setVisible(false);
				keep.setVisible(false);
				
				//keep button code
				
				
				
			}
		});
		keep.setBounds(10, 110, 126, 23);
		frame.getContentPane().add(keep);
		
		
		
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//delete button
				
				File zzztxt = new File("../Chapter11/src/myFileP2/zzz.txt");
				
				Keep1.setText("the file is being deleted");
				del.setVisible(false);
				keep.setVisible(false);
				
				
				if (zzztxt.delete()) { //dont worry bout it
				     
				    } 
				
				
				
				 ActionListener taskPerformer = new ActionListener() { 
			            public void actionPerformed(ActionEvent evt) {
			            	
			            	
			            	
			            	inc = inc +1; 
			            	
			            	switch (inc) {
			            	case 1: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/BarEmpty.png"));
			            		loadBarPer.setText("0%");
			            		break;
			            	case 2: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar1.png"));
			            		loadBarPer.setText("9%");
			            		break;
			            	case 3: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar2.png"));
			            		loadBarPer.setText("30%");
			            		break;
			            	case 4: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar3.png"));
			            		loadBarPer.setText("47%");
			            		break;
			            	case 5: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar4.png"));
			            		loadBarPer.setText("69%");
			            		break;
			            	case 6: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar5.png"));
			            		loadBarPer.setText("95%");
			            		break;
			            	case 7: 
			            		
			            		loadBar.setIcon(new ImageIcon("../Chapter11/src/myFileP2/Bar6.png"));
			            		Keep1.setText("the file has been deleted");
			            		loadBarPer.setText("100%");
			            		break;
			            		
			            	}
			            	
			            	
			            	
			            	
			            }
			        };
			        Timer timer = new Timer(1250 ,taskPerformer);
			        timer.setRepeats(true);
			        timer.start();
			        
			        if (inc == 7) {
			        	timer.stop();
			        }
			      
			        
			}
		});
		del.setBounds(157, 110, 126, 23);
		frame.getContentPane().add(del);
		
		
		
		
		
		
		JButton nuck = new JButton("Nuclear Button");
		nuck.setBackground(Color.RED);
		nuck.setForeground(Color.BLACK);
		nuck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try
		        {
		           
		            clip.loop(Clip.LOOP_CONTINUOUSLY); //starting up the lawnmover of hell 
		          
		        }
		         
		        catch (Exception ex) 
		        {
		            System.out.println("Error with playing sound.");
		            ex.printStackTrace();
		          
		          }
				nuck.setVisible(false);
				
				
				
				JButton stop = new JButton("stop the pain");
				stop.setVisible(true); //setting visablitly to true
				 
				stop.setBackground(Color.CYAN);
				stop.setForeground(Color.BLACK);
				stop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						nuck.setVisible(true);
						stop.setVisible(false);
						
						try
				        {
				            
				            clip.stop();
				          
				        }
				         
				        catch (Exception ex) 
				        {
				            System.out.println("Error with stoping sound.");
				            ex.printStackTrace();
				          
				          }
						
						
						
					}
				});
				stop.setBounds(85, 202, 120, 23);
				frame.getContentPane().add(stop);
				
				
				
				
			
			}});
		nuck.setBounds(85, 202, 120, 23);
		frame.getContentPane().add(nuck);
		
		
}
}
