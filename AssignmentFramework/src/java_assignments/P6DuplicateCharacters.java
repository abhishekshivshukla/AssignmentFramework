package java_assignments;

import java.util.Scanner;

public class P6DuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str = sc.nextLine();
		int count[]=new int[128];
		for(int i=0; i<str.length(); i++)
		{
			char alphabet = str.charAt(i);
			count[alphabet]++;
		}
		for(int i=0; i<count.length; i++)
		{
			if(count[i]>1)
				System.out.println((char)i+"   :   "+count[i]);
		}
		sc.close();
	}

}
