package office;

import java.util.Scanner;

public class ResultDevision {

	public static void main(String[] args) {
		System.out.println("Enter the marks for 6 subjects : ");
		Scanner sc=new Scanner(System.in);
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		double m3 = sc.nextDouble();
		double m4 = sc.nextDouble();
		double m5 = sc.nextDouble();
		double m6 = sc.nextDouble();
		
		/*if(m1<35||m2<35||m3<35||m4<35||m5<35||m6<35)
		{
			System.out.println("Result : Fail");
			System.exit(0);			
		}*/
		
		double total=m1+m2+m3+m4+m5+m6;
		
		double per=total*100/600;
		System.out.println("Your percentage : "+per);
		
		if(per<=100 && per>=75 )
			System.out.println("Result : Passed with Distinction");
		else if(per<75 && per>=60)
			System.out.println("Result : Passed with First Class ");
		else if(per<60 && per>=35)
			System.out.println("Result : Passed");
		else if(per<35 && per>=0)
			System.out.println("Result : Fail");
		else
			System.out.println("Result : Invalid data");
		sc.close();
		
	}
}
