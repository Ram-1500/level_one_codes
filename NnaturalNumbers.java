package FiftyCodes;

import java.util.Scanner;

public class NnaturalNumbers {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		//sum=num*(num+1)/2;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("The sum of first n natural numbers:"+sum);
}
}
