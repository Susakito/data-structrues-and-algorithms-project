package machineProb3A;
import java.util.*;

public class Menu { //FOR PRINTING THE INSTRUCTION IN THE TERMINAL AND GETTING THE CHOICE AND ORDER
	public char choice;
	public char order;
	
	Scanner in = new Scanner (System.in);
	
	public void printmenu()
	{
		System.out.println("\t" + "MAIN MENU" + "\n");
		System.out.println("CHOOSE SORTING ALGORITHM" + "\n");
		System.out.println("[K] Bucket Sort" + "\n" + "[B] Bubble Sort" + "\n" + "[I] Insert Sort" + "\n");
		System.out.println("ENTER CHOICE: ");
	}
	
	public void printorder()
	{
		System.out.println("\t" + "SELECT SORTING ORDER" + "\n");
		System.out.println("[A] Ascending" + "\n" + "[D] Descending");
		System.out.println("ENTER CHOICE: ");
	}
	
	public void setchoice()
	{
		
		choice =Character.toUpperCase(in.next().charAt(0));
	}
	
	public void setorder()
	{
		
		order =Character.toUpperCase(in.next().charAt(0));
	}
	
	public char getchoice()
	{
		return choice;
	}
	
	public char getorder()
	{
		return order;
	}

}
