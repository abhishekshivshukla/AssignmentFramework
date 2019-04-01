package java_assignments;

import java.util.Scanner;

public class P8ReverseString {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the string: ");
			String str = sc.nextLine();
			System.out.println("Reverse of the string :");
			reverseString(str);
			sc.close();
		}
	}

		private static void reverseString(String str) 
		{
			char ch[] = str.toCharArray();
			char res[] = new char[ch.length];
			for (int i = 0; i < ch.length; i++) 
			{
				if(ch[i] == ' ')
					res[i] = ' ';
			}
			int j = res.length - 1;
			for (int i = 0; i < ch.length; i++) 
			{
				if(ch[i] != ' ') 
				{
					if(res[j] == ' ') 
					{
						j--;
					}
					res[j] = ch[i];
					j--;
				}
			}
			System.out.println(String.valueOf(res));
		}
}
