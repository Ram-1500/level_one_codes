package FiftyCodes;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,rev_str="",temp_str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		sc.close();
		temp_str=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev_str=rev_str+str.charAt(i);
		}
		if(temp_str.equals(rev_str))
			System.out.println(rev_str+" is a palindrome");
		else
			System.out.println(temp_str+" is not a palindrome");
		
	}

}
