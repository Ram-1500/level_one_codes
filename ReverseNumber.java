package FiftyCodes;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Number:");
		num=sc.nextInt();
		sc.close();
	    while(num!=0)
	    {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Number:"+rev);
		
	}

}
