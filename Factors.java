package FiftyCodes;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		System.out.print("Factors:");
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}
	}

}
