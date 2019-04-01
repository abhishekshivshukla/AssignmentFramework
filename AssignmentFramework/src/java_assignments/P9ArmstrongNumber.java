package java_assignments;

import java.util.Scanner;

public class P9ArmstrongNumber {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range between which you want Armstrong numbers : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
			for(;i<=j ; i++)
			{
				boolean rs = isArmstrongNumber(i);
				if (rs == true)
					System.out.println(i);
			}
			sc.close();
	}

	private static boolean isArmstrongNumber(int j) 
	{
		int sum = 0, t = j;
		int c = countDigits(j);
		do {
			int r = j%10;
			sum = sum + pow(r, c);
			j = j/10;	
		} while (j != 0);
		return t == sum;
	}

	private static int countDigits(int j) 
	{
		int count = 0;
		do {
			count++;
			j = j/10;
		} while (j != 0);
		return count;
	}
	
	private static int pow(int j, int p) 
	{
		int pw = 1;
		while(p > 0) 
		{
			pw = pw*j;
			p--;
		}
		return pw;
	}
}
