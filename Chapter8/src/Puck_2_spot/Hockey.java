package Puck_2_spot;

public class Hockey 
{

	public static void main(String[] args) 
	{
		//Initialization of two puck objects to be tested.
		Puck youthPuck = new Puck(1.0, 1.5, 4.25); // creating youth puck
		Puck youthPuck2 = new Puck(2.0, 2.0, 5.25);
		
		//Printing information on the puck objects using .toString() method.
		System.out.println("   The first puck: \n" + youthPuck.toString(youthPuck));
		System.out.println("\n   The second puck: \n" + youthPuck2.toString(youthPuck2));
		
		//If statement using boolean method .equals() to determine whether the objects are the same or not.
		if (youthPuck.equals(youthPuck2)) 
		{
			System.out.println("\nThe pucks are equal.");
		}
		else 
		{
			System.out.println("\nThe pucks are not equal.");
		}
		
		
	
		
		
		//not a switch statment because i dont like them
		if (youthPuck.compareTo(youthPuck2) == 0)
		{
			System.out.println("\nThe second puck weighs more."); // case if the
		}
		else if (youthPuck.compareTo(youthPuck2) == 1)
		{
			System.out.println("\nThe second puck weighs the same.");
		}
		else if (youthPuck.compareTo(youthPuck2) == 2)
		{
			System.out.println("\nThe second puck weighs less.");
		}

		
		
	}
}
