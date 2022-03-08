package myFileP2;

import java.awt.EventQueue;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class myFile {

	private JFrame frame;

	
	// to store current position
    Long currentFrame;
    Clip clip;
      
    // current status of clip
    String status;
      
    AudioInputStream audioInputStream;
    static String filePath;
  
    
    
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
          
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        
        initialize();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	
	
	private void gotoChoice(int c)
            throws IOException, LineUnavailableException, UnsupportedAudioFileException 
    {
        switch (c) 
        {
            case 1:
                pause();
                break;
            case 2:
                resumeAudio();
                break;
            case 3:
                restart();
                break;
            case 4:
                stop();
                break;
            case 5:
                System.out.println("Enter time (" + 0 + 
                ", " + clip.getMicrosecondLength() + ")");
                Scanner sc = new Scanner(System.in);
                long c1 = sc.nextLong();
                jump(c1);
                break;
      
        }
      
    }
	
	
	public void play() 
    {
        //start the clip
        clip.start();
          
        status = "play";
    }
      
    // Method to pause the audio
    public void pause() 
    {
        if (status.equals("paused")) 
        {
            System.out.println("audio is already paused");
            return;
        }
        this.currentFrame = this.clip.getMicrosecondPosition();
        clip.stop();
        status = "paused";
    }
	
 // Method to resume the audio
    public void resumeAudio() throws UnsupportedAudioFileException,
                                IOException, LineUnavailableException 
    {
        if (status.equals("play")) 
        {
            System.out.println("Audio is already "+
            "being played");
            return;
        }
        clip.close();
        resetAudioStream();
        clip.setMicrosecondPosition(currentFrame);
        this.play();
    }
    
    
 // Method to restart the audio
    public void restart() throws IOException, LineUnavailableException,
                                            UnsupportedAudioFileException 
    {
        clip.stop();
        clip.close();
        resetAudioStream();
        currentFrame = 0L;
        clip.setMicrosecondPosition(0);
        this.play();
    }
      
    
    // Method to stop the audio
    public void stop() throws UnsupportedAudioFileException,
    IOException, LineUnavailableException 
    {
        currentFrame = 0L;
        clip.stop();
        clip.close();
    }
    
    
 // Method to jump over a specific part
    public void jump(long c) throws UnsupportedAudioFileException, IOException,
                                                        LineUnavailableException 
    {
        if (c > 0 && c < clip.getMicrosecondLength()) 
        {
            clip.stop();
            clip.close();
            resetAudioStream();
            currentFrame = c;
            clip.setMicrosecondPosition(c);
            this.play();
        }
    }
      
    // Method to reset audio stream
    public void resetAudioStream() throws UnsupportedAudioFileException, IOException,
                                            LineUnavailableException 
    {
        audioInputStream = AudioSystem.getAudioInputStream(
        new File(filePath).getAbsoluteFile());
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
	
	
	
	
	
	    
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 309, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel zzz = new JLabel("A new File named ZZZ.txt has been created,\r\n");
		zzz.setBounds(10, 11, 273, 25);
		frame.getContentPane().add(zzz);
		
		JLabel Keep1 = new JLabel("do you wish to keep this file?");
		Keep1.setBounds(10, 39, 273, 14);
		frame.getContentPane().add(Keep1);
		
		JButton keep = new JButton("keep this file");
		keep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//keep button code
				
				
				
			}
		});
		keep.setBounds(10, 110, 114, 23);
		frame.getContentPane().add(keep);
		
		JButton del = new JButton("delete the file");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//delete button code
				
				
				
			}
		});
		del.setBounds(174, 110, 109, 23);
		frame.getContentPane().add(del);
		
		JButton nuck = new JButton("Nuclear Button");
		nuck.setBackground(Color.RED);
		nuck.setForeground(Color.BLACK);
		nuck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 
				try
		        {
		            filePath = "../Chapter11/src/myFileP2/0002074.wav";
		            myFile audioPlayer = new myFile();
		              
		            audioPlayer.play();
		            Scanner sc = new Scanner(System.in);
		              
		            while (true)
		            {
		                System.out.println("1. pause");
		                System.out.println("2. resume");
		                System.out.println("3. restart");
		                System.out.println("4. stop");
		                System.out.println("5. Jump to specific time");
		                int c = sc.nextInt();
		                audioPlayer.gotoChoice(c);
		                if (c == 4)
		                break;
		            }
		            sc.close();
		        } 
		          
		        catch (Exception ex) 
		        {
		            System.out.println("Error with playing sound.");
		            ex.printStackTrace();
		          
		          }
				
				
			    
			    
			    
			    
			    
			    
				
				
				
				
			
			}});
		nuck.setBounds(85, 202, 120, 23);
		frame.getContentPane().add(nuck);
	}
}
