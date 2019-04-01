package java_assignments;

import java.util.Scanner;

public class P14ReverseOddIndexElementsArray {
	public static void main(String[] args) 
	{
		int a[] = readArray();
		System.out.println("Entered array:");
		displayArray(a);
		int b[] = reverseOddIndex(a);
		System.out.println("Reversed array at odd index:");
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
	
	private static int[] reverseOddIndex(int[] a) 
	{
		int b[] = new int[a.length];
		int o[] = new int[a.length/2];
		int e[] = new int[b.length-o.length];
		int j = o.length-1;
		for (int i = 0,k = 0; i < a.length; i++) 
		{
			if(i%2 != 0)
			{
				o[j] = a[i];
				j--;
			}
			else 
			{
				e[k]= a[i];
				k++;
			}
		}
		for (int i = 0,m = 0,n = 0; i < b.length; i++) 
		{
			if (i%2 != 0)
			{
				b[i]=o[m];
				m++;
			}
			else 
			{
				b[i]=e[n];
				n++;
			}
		}
		return b;
	}
}
