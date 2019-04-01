package java_assignments;

import java.util.Scanner;

public class P11ReverseFirstHalfArray {
	public static void main(String[] args) 
	{
		int a[] = readArray();
		System.out.println("Entered array:");
		displayArray(a);
		int b[] = reverseFirstHalfArray(a);
		System.out.println("Your array:");
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
	
	private static int[] reverseFirstHalfArray(int[] a) 
	{
		int b[] = new int[a.length];
		for (int i = b.length/2-1,j=0; i >=0; i--)
			b[j++]=a[i];
		for (int i = b.length/2; i < b.length; i++)
			b[i]=a[i];
		return b;
	}
}
