package FiftyCodes;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int number1=0,number2=1,number3,count;
		Scanner sc=new Scanner(System.in);
		count=sc.nextInt();
		sc.close();
		System.out.println("count: ");
		System.out.print(number1+" "+number2);
		for(int i=2;i<count;++i) 
		{
			number3=number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
			
		}
		
	}
}