package FiftyCodes;

public class SecondHighNumberInArray {
	
	public static int SecondBig(int array[],int total) 
	{
		for(int i=0;i<array.length;i++) 
		{
			int temp=0;
			for(int j=i+1;j<array.length;j++) 
			{
				
				if(array[i]>array[j]) 
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
			
		}return(array[total-2]);
	}

	public static void main(String[] args) 
	{
		int array1[]= {2,7,4,9,67,45};
		int array2[]= {6,7,9,5,7,4};
		System.out.println("Second bigiest number of array:"+SecondBig(array1,6));
		System.out.println("Second bigiest number of array:"+SecondBig(array2,6));
	}

}
