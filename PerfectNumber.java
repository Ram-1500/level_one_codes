package FiftyCodes;

import java.util.Scanner;

public class PerfectNumber {
//sum of factors except itself. ex:6
	public static void main(String[] args) {
		int sum=0,num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
				
			}
		}
		if(num==sum)
			System.out.println(sum+" is a perfect number.");
		else
			System.out.println(num+" is not a perfect number.");
		

	}

}
