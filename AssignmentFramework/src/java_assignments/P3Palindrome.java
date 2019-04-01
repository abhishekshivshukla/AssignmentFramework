 package java_assignments;

import java.util.Scanner;

public class P3Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str = sc.nextLine();
		boolean result = isPalindrome(str);
		if(result==true)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is NOT a Palindrome");
		sc.close();
	}

	private static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
		if(str.charAt(i)!=str.charAt(j))
			i++;
			j--;
			return false;
		}
		return true;
	}
}