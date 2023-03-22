package com.day2;
//Write a java program to find sum of digits in any number.
import java.util.Scanner;
public class SumDigit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;	
		}
		System.out.println("sum = "+sum);

	}

}
