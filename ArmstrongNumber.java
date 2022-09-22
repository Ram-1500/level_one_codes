package FiftyCodes;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,digits=0,last,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		int temp=num;
		while(temp>0) 
		{
			temp=temp/10;
			digits++;
		}
		temp=num;
		while(temp>0) 
		{
			last=temp%10;
			temp=temp/10;
			sum=sum+(int)Math.pow(last, digits);
		}
		if(num==sum)
			System.out.println(sum+" is Armstrong Number");
		else
			System.out.println(num+" is not an amstrong Number");

	}

}
