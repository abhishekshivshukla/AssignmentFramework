package java_assignments;

import java.util.Scanner;

public class P15SwapOddIndexElementsWithImmediate {
	public static void main(String[] args) 
	{
		int a[] = readArray();
		System.out.println("Your array:");
		displayArray(a);
		int b[] = swapIndexOE(a);
		System.out.println("Reversed array:");
		displayArray(b);
	}

	private static int[] readArray() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values (even)");
		int n = sc.nextInt();
		System.out.println("Enter values");
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) 
			array[i] = sc.nextInt();
		sc.close();
		return array;
	}
	
	static void displayArray(int array[])
	{
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]);
			if(i < array.length - 1)
				System.out.print(",");	
		}
		System.out.println();
	}
	
	private static int[] swapIndexOE(int[] a) 
	{
		int k, temp;
		for (int i = 0; i < a.length; i += 2) 
		{
			k = i + 1;
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
		}
		return a;
	}
}
