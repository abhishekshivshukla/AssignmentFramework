package java_assignments;

import java.util.Scanner;

public class P4Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String str2 = sc.nextLine();
		boolean result = isAnagram(str1,str2);
		if(result==true)
			System.out.println("String is an Anagram");
		else
			System.out.println("String is NOT an Anagram");
		sc.close();
	}

	private static boolean isAnagram(String str1, String str2) 
	{
		while(str1.length()==str2.length())
		{
		int s1[] = countStrAlphabets(str1);
		int s2[] = countStrAlphabets(str2);
			for(int i=0; i<25; i++)
			{
				if(s1[i]!=s2[i])				
					return false;
			}
			return true;
		}
		return false;
	}

	private static int[] countStrAlphabets(String str) {
		int count[]=new int[25];
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>'a' && ch<'z')
				count[ch-97]++;
			else if(ch>'A' && ch<'Z')
				count[ch-65]++;
		}
		return count;
	}
}
