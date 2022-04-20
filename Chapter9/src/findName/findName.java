package findName;



import java.util.Scanner; 
import java.lang.Math;
import static java.lang.Math.pow;


public class findName {

	
	
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int qw = 1;
	        int stunum ;
	        String stuname ;
	        Scanner input = new Scanner(System.in);
	        String search;
	        int location;
	        
	        System.out.print("enter how many students are in your rosster: ");
	        stunum = input.nextInt();
	        input.nextLine();
	        
	       // String [] sturarr = new String[stunum]; // array named sturar with a lenght determined by the user 
	        String[] sturarr = {"Volvo", "BMW", "Ford", "Mazda"};
	        
	        
	        /*
	         for(int g =0; g< sturarr.length; g++){ //g does thing to make the loop run just the right aount to not give an error
	             
	             System.out.print("enter your students name(s): ");
	             stuname = input.nextLine();
	             sturarr[g]= stuname;
	           
	          
	             
	       }
*/
	        
	        
	         System.out.print("what name would you like to search?: ");
	         search = input.nextLine();
	         
	         System.out.print(search);
	         
	         
	         
	        
	         location = Search.linearSTR(sturarr, search);
	         
	         System.out.print(location);
	         
	         
	         if (location == -1) {
	        	 
	         System.out.println("Sorry, name not found in array.");
	         } 
	         
	         else {
	         
	         System.out.println("First occurrence is element " + location);
	         }
		
		
		
	}

}
