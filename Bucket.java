package machineProb3A;
import java.util.Arrays;

public class Bucket 
	{
		private int[] arr;

		public void sort(int[] arr, int max_value) 
		   {
		       // Bucket Sort
		       int[] Bucket = new int[max_value + 1]; //INITIALIZE BUCKET
		       int[] sorted_nums = new int[arr.length]; //ARRAY FOR THE FINAL ARRAY
		        
		        for (int i = 0; i < arr.length; i++) 
		         Bucket[arr[i]]++; //PUTING THE VALUE IN ITS RESPECTIVE BUCKET
		         int outPos = 0;
		        for (int i = 0; i < Bucket.length; i++) //SORRTING THE BUCKETS
		             for (int j = 0; j < Bucket[i]; j++)
		                 sorted_nums[outPos++] = i;
		         this.arr = sorted_nums;
		         
		     }
		 
		   public int max_value(int[] nums) //TO KNOW THE NUMBER OF BUCKETS
		   {
		       int max_value = 0;
		       for (int i = 0; i < nums.length; i++)
		           if (nums[i] > max_value)
		               max_value = nums[i];
		       return max_value;
		   } 
		   
		   public void printA()
		   {
			   System.out.println("SORTED VALUES: ");
			   for(int i = 0; i < arr.length; i++)
				   System.out.println(arr[i]);
		   }
		   
		   public void printD()
		   {
			   for(int i = arr.length - 1; i >= 0; i--)
			   {
				   System.out.println(arr[i]);
			   }
		   }
			
		  
		    
		    
		  
	
		
	
	}
