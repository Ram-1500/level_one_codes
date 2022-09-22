package FiftyCodes;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		int num,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num/=10;
		}
		System.out.println("Sum of digits:"+sum);

	}

}
