package machineProb3A;

public class Insert
{
	private int[] arr;
	
	public void sort(int[] arr)
	{
		 
	        int n = arr.length; 
	        for (int i = 1; i < n; ++i) 
	        { 
	            int key = arr[i]; //TEMPORARY VARIABLE INCASE SWAPING OCCURS
	            int j = i - 1; 
	  
	            
	            while (j >= 0 && arr[j] > key) //CONDITION IF i < j;
		            { 
		                arr[j + 1] = arr[j]; //SWAPS
		                j = j - 1; //POINTER FOR THE NEXT VALUE
		            } 
	            arr[j + 1] = key; //COPIES THE CORRECT VALUE INTO THE CORRECT INDEX
	        
	        	} this.arr = arr;
	}
	
	public void printA()
	   {
			System.out.println("SORTED VALUES: ");
		   for(int i = 0; i < arr.length; i++)
			   System.out.println(arr[i]);
	   }
	   
	   public void printD()
	   {
		   System.out.println("SORTED VALUES: ");
		   for(int i = arr.length - 1; i >= 0; i--)
		   {
			   System.out.println(arr[i]);
		   }
	   }

}
