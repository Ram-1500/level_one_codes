package FiftyCodes;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// R_Code Auto-generated method stub
		int num1,num2,lcm=0;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		sc.close();
		int max=(num1>num2)?num1:num2;
		for(int i=max;i<=num1*num2;i++)
		{
			if(i%num1==0&&i%num2==0)
			{
				lcm=i; break;
			}
		}
		System.out.print(lcm+" is Lcm");

	}

}
