package com.loop;
//9.	 Write a Java program to calculate product of digits of any number.
import java.util.Scanner;

public class Product_digit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num=sc.nextInt();
		int product=1;
		while(num>0)
		{
			int r=num%10;
			product=product*r;
			num=num/10;	
		}
		System.out.println("product = "+product);

	}

}
