package java_assignments;

import java.util.Scanner;

public class P2RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String with white spaces : ");
		String str = sc.nextLine();
		//String updatedString = str.replaceAll(" ", "");
		String updatedString = str.replaceAll("\\s", ""); //using regex
		System.out.println(updatedString);
		sc.close();
	}

}
