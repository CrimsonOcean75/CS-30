import java.awt.EventQueue;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Name_of_your_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Name_of_your_GUI window = new Name_of_your_GUI();
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
	public Name_of_your_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	int i = 0;
	String stringI = "";
	
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.MAGENTA);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
	
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(24, 24, 378, 203);
		frame.getContentPane().add(panel);
		
		JLabel stink = new JLabel("nice smell");
		panel.add(stink);
		
		
		
		JButton btnPrintStinky = new JButton("print stinky");
		panel.add(btnPrintStinky);
		
		btnPrintStinky.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				//for (int i = 0; i <10; i++ ) {
					
					
					//System.out.println("stink" + i);
					
					
					stink.setText("stinky" + i);
					
					stringI = stink.getText();
					
					System.out.println(stringI);
					
					
					
					//try
				    //{
				    //    Thread.sleep(1000);
				    //}
				    //catch(InterruptedException ex)
				    //{
				    //    Thread.currentThread().interrupt();
				    //}
					
					
					
					
				//}
						
				
				
				
				}
				
				 
			
			
			
			
		});
		
		
	}
}
