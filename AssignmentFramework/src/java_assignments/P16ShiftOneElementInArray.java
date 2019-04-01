package java_assignments;

import java.util.Scanner;

public class P16ShiftOneElementInArray {

	public static void main(String[] args) 
	{
		int a[] = readArray();
		System.out.println("Your array:");
		displayArray(a);
		int b[] = rightShift(a);
		System.out.println("Array after shift:");
		displayArray(b);
	}
	

	private static int[] readArray() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values : ");
		int n = sc.nextInt();
		System.out.println("Enter values");
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = sc.nextInt();
		}
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
	
	private static int[] rightShift(int[] a) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shift count: ");
		int n = sc.nextInt();
		int last;
		for (int i = 0; i < n; i++) 
		{
			last = a[a.length-1];
			for (int j = a.length - 1;j > 0; j--) 
			{
				a[j] = a[j-1];	
			}
			a[0] = last;
		}
		sc.close();
		return a;
	}

}
