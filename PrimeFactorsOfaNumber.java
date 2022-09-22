package FiftyCodes;

import java.util.Scanner;

public class PrimeFactorsOfaNumber {
	
	static int isPrime(int num)
	{
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
				return 0;
		}
		return 1;
	}
	
	static void PrimeFactors(int num)
	{
		System.out.println("prime factors of "+num+" are:");
		for(int i=2;i<=num;i++)
		{
			if(isPrime(i)==1)
			{
				int x=num;

				
				while(x%i==0)
				{
					System.out.print(i+" ");
					x/=i;
				}
			}
		}
	}

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		PrimeFactors(num);

	}

}
