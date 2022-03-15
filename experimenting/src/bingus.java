import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class bingus {

	
	public Void time() {
		
		ActionListener al=new ActionListener() {
			
			
		    public void actionPerformed(ActionEvent ae) {
		        System.out.println("quark");
		       
		            
		    }
		};
		Timer timer=new Timer(1000, al);//create the timer which calls the actionperformed method for every 1000 millisecond(1 second=1000 millisecond)
		timer.start();//start the task
		
		
	}
}
