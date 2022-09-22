package FiftyCodes;
import java.util.*;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of number1 & number2:");
		number1=sc.nextInt();
		number2=sc.nextInt();
		sc.close();
		System.out.println("Before Swapiing:"+number1+" "+number2);
		//Swapping
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("After swapping:"+number1+" "+number2);
		

	}

}
