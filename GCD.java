package FiftyCodes;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int num1,num2,Gcd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Number 1:");	num1=sc.nextInt();
		System.out.println("Number 2:");	num2=sc.nextInt();		
		sc.close();
		
		Gcd=FindGcd(num1,num2);
		System.out.println("GCD is:"+Gcd);
	}
	public static int FindGcd(int Number1,int Number2) {
		
		while(Number2!=0) {
			if(Number1>Number2)
				Number1=Number1-Number2;
			else
				Number2=Number2-Number1;			
		}
		return(Number1);
	}
}

/*
 public static void main(String[] args) {
 int hcf=0,num1=10,num2=20;
 if(int i=1;i<=num1||i<=num2;i++)
 {
	 if(num1%i==0&&num2%i==0)
		 hcf=i;
 }System.out.print(hcf);
 
 */

