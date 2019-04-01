package java_assignments;

import java.util.Scanner;

public class P7RotationOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string ");
		String s1 = sc.nextLine();
		System.out.println("Enter second string ");
		String s2 = sc.nextLine();
		boolean result = isRotation(s1, s2);
		if (result==true)
			System.out.println("String: " +s2+ " is rotation of String: " +s1);
		else
			System.out.println("String: " +s2+ " is not a rotation of String: " +s1);
		sc.close();
	}

	private static boolean isRotation(String str1, String str2) {
		if(str1.length() != str2.length()) 
		{
			return false;
		}
		String str3 = str1 + str1;
		if(str3.contains(str2))
			return true;
		else
			return false;
	}

}
