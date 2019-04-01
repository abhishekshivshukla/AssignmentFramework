package office;


import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of units :");		
		int units=sc.nextInt();
		System.out.println("Previous arrear : ");
		final double arr = sc.nextDouble();
		final double fine=arr*0.1;
		double bill;
		double discount;
		
		if(units<=50)
		{
			bill=units*1.20;
			System.out.println("Your electricity bill is Rs. : "+(bill+arr+fine));
		}
		else if(units<=100 && units>50)
		{
			bill=50*1.2+(units-50)*2.4;
			System.out.println("Your electricity bill is Rs. : "+(bill+arr+fine));
		}
		else if(units<=150 && units >100)
		{
			bill=50*1.2+50*2.4+(units-100)*3.6;
			System.out.println("Your electricity bill is Rs. : "+(bill+arr+fine));
		}
		else if(units<=200 && units >150)
		{
			bill=50*1.2+50*2.4+50*3.6+(units-150)*4.8;
			System.out.println("Payable Electricity Bill : "+(bill+arr+fine));
		}
		
		else if(units>200)
		{
			bill=50*1.2+50*2.4+50*3.6+(units-150)*4.8;
			discount=bill*0.05;
			if(discount>200)
				discount=200;
			double total=bill+arr+fine-discount;
			System.out.println("Payable Electricity Bill : "+total);
		}
		sc.close();
			
			
		
		
	}

}
