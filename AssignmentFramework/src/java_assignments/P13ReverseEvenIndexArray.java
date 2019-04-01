package java_assignments;

import java.util.Scanner;

public class P13ReverseEvenIndexArray {
	public static void main(String[] args) 
	{
		int a[] = readArray();
		System.out.println("Entered array:");
		displayArray(a);
		int b[] = reverseEvenIndex(a);
		System.out.println("Reversed array at even index:");
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
	
	private static int[] reverseEvenIndex(int[] a) 
	{
		int b[] = new int[a.length];
		int e[] = new int[a.length/2];
		int o[] = new int[b.length-e.length];
		int j = e.length-1;
		for (int i = 0,k = 0; i < a.length; i++) 
		{
			if(i%2==0)
			{
				e[j] = a[i];
				j--;
			}
			else 
			{
				o[k]= a[i];
				k++;
			}
		}
		for (int i = 0,m = 0,n = 0; i < b.length; i++) 
		{
			if (i%2 == 0)
			{
				b[i]=e[m];
				m++;
			}
			else 
			{
				b[i]=o[n];
				n++;
			}			
		}
		return b;
	}
}
