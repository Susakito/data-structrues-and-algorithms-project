package machineProb3A;
import java.util.*;


public class Input { //GET THE INPUT FROM THE USER AND PUT IT IN A ARRAY
	private int[] arr = new int[10];//{0,0,0,0,0,0,0,0,0,0};
	
	
	Scanner in = new Scanner(System.in);
	
	public void setininput() //SETING THE VALUE INSIDE THE ARRAY
	{
		System.out.println("Input 10 Values [0-100]: ");
		for(int i = 0; i < 10; i++)
		{
			arr[i] = in.nextInt();
		}
		
	}
	
	public int[] getinput()
	{
		return arr;
	}
	
	

}
