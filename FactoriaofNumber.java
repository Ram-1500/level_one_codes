package FiftyCodes;

import java.util.Scanner;

public class FactoriaofNumber {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		int fact=FindFactorial(num);
		System.out.println("The factorial of the "+num+" is:"+fact);

	}
	static int FindFactorial(int num)
	{
		if(num==0)
			return 1;
		return num*FindFactorial(num-1);
	}

}
