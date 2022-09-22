package FiftyCodes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1,n;
		System.out.println("Factorial Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is:"+fact);
		
		

	}

}
