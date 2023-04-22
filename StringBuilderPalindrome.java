package string;

import java.util.Scanner;

public class StringBuilderPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//leakage in memory and program
		System.out.println("Enter a String : ");
		String str=sc.nextLine().toLowerCase();
		StringBuilder builder = new StringBuilder(str);
		sc.close();
		if(builder.equals(builder.reverse()))
		{
			System.out.println(str+" is a Palindrome String");
		}
		else
		{
			System.out.println(str+" is not a Palindrome String");
		}

	}

}
