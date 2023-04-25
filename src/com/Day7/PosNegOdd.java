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
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				System.out.print(a[i]+"  ");
				count++;
			}
		}
		System.out.println();
		System.out.println("No Of Positive Number : "+count);
		System.out.println("Negative Number : ");
		int countn=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+"  ");
				countn++;
			}
		}
		System.out.println();
		System.out.println("No Of Negative Number : "+countn);
		System.out.println("Odd Number : ");
		int counto=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" , ");
				counto++;
			}
		}
		System.out.println();
		System.out.println("No Of Odd Number : "+counto);
		System.out.println("Even Number : ");
		int counte=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" , ");
			}
		}
		System.out.println();
		System.out.println("No Of Even Number : "+counte);
		System.out.println("Zero Number : ");
		int count0=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count0++;
			}
		}
		System.out.println("No Of zero Number : "+count0);
		

	}

}
