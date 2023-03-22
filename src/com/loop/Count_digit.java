package com.loop;
//	 Write a Java program to count number of digits in any number
import java.util.Scanner;

public class Count_digit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num=sc.nextInt();
		int count =0;
		while(num>0)
		{
			int r=num%10;
			++count;
			num=num/10;	
		}
		System.out.println("Number of digit = "+count);

	}

}
