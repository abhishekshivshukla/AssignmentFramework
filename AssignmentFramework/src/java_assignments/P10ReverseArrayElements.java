package java_assignments;

import java.util.Scanner;

public class P10ReverseArrayElements {

		public static void main(String[] args) 
		{
			int a[] = readArray();
			System.out.println("Given array:");
			displayArray(a);
			int b[] = reverseArray(a, a.length);
			System.out.println("Reversed array:");
			displayArray(b);
		}

		private static int[] readArray() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of values : ");
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
		
		private static int[] reverseArray(int[] a, int n) 
		{
			int b[] = new int[n];
			int j = n;
			for (int i = 0; i < n; i++) 
			{
				b[j - 1] = a[i];
				j = j - 1;
				
			}
			return b;
		}
}
