package FiftyCodes;

import java.util.Scanner;

public class PerfectSquare {

	static boolean isPerfectSq(int num)
	{
		if(num>0)
		{
			int sr=(int)Math.sqrt(num);			
			return(sr*sr==num);			
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		if(isPerfectSq(num))
			System.out.println(num+" is a perfect square");
		else
			System.out.println(num+" is not a perfect square");
	}
}
