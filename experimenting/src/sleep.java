import java.util.concurrent.TimeUnit;

public class sleep {

	
	
	
	 public static void main(String[] args) 
	    {
	
		 
		 
		 System.out.println("get rat");
			
			
			
			try
			{
			    Thread.sleep(3500);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
			
			
			System.out.println("rat get");
			
			
			TimeUnit.SECONDS.sleep(1);
			
			
	    }
	
	
	
}
