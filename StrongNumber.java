package FiftyCodes;

import java.util.Scanner;

public class StrongNumber {
//A number whose sum of factorial digits is equal to the number itself.
	static int Factorial(int num)
	{
		if(num==0)
			return 1;
		return num*Factorial(num-1);
	}
	static boolean DetectFactorial(int num)
	{
		int sum=0,digit;
		int temp=num;
		while(temp>0)
		{
		digit=temp%10;
		sum+=Factorial(digit);
		temp/=10;	
		}
		return sum==num;
	}
		
	
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		if(DetectFactorial(num))
			System.out.println(num+" is a Strong number.");
		else
			System.out.println(num+" is not a Strong number.");
	}

}
