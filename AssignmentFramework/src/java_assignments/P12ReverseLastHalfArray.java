package java_assignments;

import java.util.Scanner;

public class P12ReverseLastHalfArray {

	public static void main(String[] args) {
		int a[] = readArray();
		System.out.println("Entered array:");
		displayArray(a);
		int b[] = reverseLastHalfArray(a);
		System.out.println("Last half Reversed array:");
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
	
	private static int[] reverseLastHalfArray(int[] a) 
	{
		int b[] = new int[a.length];
		for (int i =0; i <b.length/2 ; i++)
			b[i]=a[i];
		for (int i = b.length-1,j=b.length/2; i >=b.length/2; i--)
			b[j++]=a[i];
		return b;
	}

}
