package office;

import java.util.Scanner;

public class MarriageEligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Your gender : ");
		String gender = sc.next();
		System.out.println("Your age : ");
		int age = sc.nextInt();
		
		if(gender.equalsIgnoreCase("male"))
		{
			if(age>21)
				System.out.println("You are eligible for marriage");
			else
				System.out.println("You are NOT eligible for marriage");
		}
		else if(gender.equalsIgnoreCase("female"))
		{
			if(age>18)
				System.out.println("You are eligible for marriage");
			else
				System.out.println("You are NOT eligible for marriage");
		}
		else
			System.out.println("Provide correct details");
		sc.close();
		
		
	}

}
