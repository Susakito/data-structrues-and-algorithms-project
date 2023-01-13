package machineProb3A;

public class Bubble 
{
	private int[] arr;
	
	public void sort(int[] arr)
	{
		int tmp;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j]) //COMPARE VALUE AND IF TRUE
				{
					tmp = arr[i];
					arr[i] = arr[j]; //SWAP VALUE
					arr[j] = tmp;
				}
			}
		}
		this.arr = arr;
			
	}
	
	public void printA() //PRINTING SORTED ARRAY
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
