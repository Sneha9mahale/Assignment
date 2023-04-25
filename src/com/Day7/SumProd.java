package com.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class SumProd {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Enter Element");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int sum=0;
		int product=1;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			product=product*a[i];
		}
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+product);

	}

}
