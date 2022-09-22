package FiftyCodes;

import java.util.Scanner;

public class Greatestof3 {

	public static void main(String[] args) {
		int n1,n2,n3;
		System.out.println("Give 3 inputs:");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		sc.close();
		int num=(n1>n2)?n1:n2;
		int greatnum=(num>n3)?num:n3;
		System.out.println("The greatest among three:"+greatnum);
	}

}
