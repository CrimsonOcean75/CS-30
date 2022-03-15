


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
import java.util.concurrent.TimeUnit;

import javax.swing.Timer;




public class swing_timer {
	
	
	
	
	
	public static void main(String [] args) throws Exception{
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //...Perform a task...

                System.out.println("Reading SMTP Info.");
            }
        };
        Timer timer = new Timer(5000 ,taskPerformer);
        timer.setRepeats(false);
        timer.start();
        
        Thread.sleep(1500);

    }
}
