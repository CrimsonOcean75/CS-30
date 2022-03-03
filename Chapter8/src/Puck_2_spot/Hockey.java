package Puck_2_spot;

public class Hockey 
{

	public static void main(String[] args) 
	{
		
		Puck yPuck = new Puck(1.0, 1.5, 4.25); // creating youth puck
		Puck sPuck = new Puck(2.0, 2.0, 5.25); // creating standared puck
		
		//Printing information on the puck objects using .toString() method.
		System.out.println("   The first puck: \n" + yPuck.toString(yPuck));
		System.out.println("\n   The second puck: \n" + sPuck.toString(sPuck));
		
		//If statement using boolean method .equals() to determine whether the objects are the same or not.
		if (yPuck.equals(sPuck)) 
		{
			System.out.println("\nThe pucks are equal.");
		}
		else 
		{
			System.out.println("\nThe pucks are not equal.");
		}
		
		
	
		
		
		//not a switch statment because i dont like them (although you could use a switch statment) the values come form a method in puck
		if (yPuck.compareTo(sPuck) == 0)
		{
			System.out.println("\nThe second puck weighs more."); // case if the
		}
		else if (yPuck.compareTo(sPuck) == 1)
		{
			System.out.println("\nThe second puck weighs the same.");
		}
		else if (yPuck.compareTo(sPuck) == 2)
		{
			System.out.println("\nThe second puck weighs less.");
		}

		
		
	}
}
