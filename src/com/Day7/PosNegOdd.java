package com.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class PosNegOdd {

	public static void main(String[] args) {
		int a[]=new int[10] ;
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Positive Number : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.print(a[i]+" , ");
			}
		}
		System.out.println("Negative Number : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+" , ");
			}
		}
		System.out.println("Odd Number : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" , ");
			}
		}
		System.out.println("Even Number : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" , ");
			}
		}
		System.out.println("Positive Number : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.print(a[i]+" , ");
			}
		}
		

	}

}
