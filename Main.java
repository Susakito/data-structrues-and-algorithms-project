package machineProb3A;
import java.util.*;

public class Main {
	static Scanner in = new Scanner (System.in);
	
	static Input input = new Input();
	static Menu menu = new Menu();
	

	public static void main(String args[])
	{
		input.setininput();
		sort();					
	}
	
	public static void sort() //METHOD FOR CHOOSING THE ALGORITHM AND ORDER
	{	
		menu.printmenu();
		char choice = in.next().charAt(0);
		choice = Character.toUpperCase(choice); // FOR CHOOSING THE ALGORITHM
		
		if(choice == 'K') //BUCKET
		{	
			System.out.println("\nALGORITHM SELECTED: BUCKET SORT");
			
			Bucket bucket = new Bucket();
			bucket.sort(input.getinput(), bucket.max_value(input.getinput()));
			
			menu.printorder();
			menu.setorder(); //FOR CHOOSING THE ORDER
		 
			System.out.println("\nALGORITHM SELECTED: BUCKET SORT");
			
			if(menu.getorder()== 'A')
			{
				System.out.println("SORTING ORDER: ASCENDING");
				bucket.printA();
			}
			else
			{
				System.out.println("SORTING ORDER: ASCENDING");
				bucket.printD();
			}
			
			again();
			
		}
		
		else if(choice == 'B') //BUBBLE
		{
			System.out.println("\nALGORITHM SELECTED: BUBBLE SORT");
			
			Bubble bubble = new Bubble();
			bubble.sort(input.getinput());
			
			menu.printorder();
			menu.setorder();
			
			System.out.println("\nALGORITHM SELECTED: BUBBLE SORT");
			
			if(menu.getorder()== 'A')
			{
				System.out.println("SORTING ORDER: ASCENDING");
				bubble.printA();
			}
			else
			{
				System.out.println("SORTING ORDER: ASCENDING");
				bubble.printD();
			}
			
			again();
			
		}
		
		else if(choice == 'I') //INSERT
		{
			System.out.println("\nALGORITHM SELECTED: INSERT SORT");
			Insert insert = new Insert();
			insert.sort(input.getinput());
			menu.printorder();
			menu.setorder();
			
			System.out.println("\nALGORITHM SELECTED: INSERT SORT");
			
			if(menu.getorder()== 'A')
			{
				System.out.println("SORTING ORDER: ASCENDING");
				insert.printA();
			}
			else
			{
				System.out.println("SORTING ORDER: ASCENDING");
				insert.printD();
			}
			
			
			
		}
		
		else
			System.out.println("Invalid input");
	}
	
	public static void again()
	{
		System.out.println("\nSORT AGAIN[Y/N]?: ");	
		char cc;
		cc = Character.toUpperCase(in.next().charAt(0));
		if(cc == 'Y')
		{
			sort();
		}
	}
	
	
	
}

