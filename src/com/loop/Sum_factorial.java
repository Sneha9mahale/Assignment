package com.loop;

import java.util.Scanner;

public class Sum_factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter any number:");
		num=sc.nextInt();
		int sum=0;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			
		for(int j=1;j<=i;j++)
		{
			fact=fact*j;
			
		}
		sum=sum+fact;
		fact=1;
		
		}
		System.out.print(sum);

	}
}


