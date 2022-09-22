package FiftyCodes;

public class SortArray {

	public static void main(String[] args) {
		int array[]= new int[]{4,5,2,3,32,332,34,43};
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
			System.out.print(array[i]+" ");
		}
		

	}

}
