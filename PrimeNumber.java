package FiftyCodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		sc.close();
		checkPrime(Num);

	}
	public static void checkPrime(int Number) {
		int m,flag=0;
		m=Number/2;
		if(Number==0||Number==1)
			System.out.println(Number+" is not a prime.");
		else {
			for(int i=2;i<=m;i++) {
				if(Number%i==0) {
					System.out.println(Number+" is not a prime.");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(Number+" is a prime Numer.");
		}
	}

}
