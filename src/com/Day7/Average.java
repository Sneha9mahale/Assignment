package com.Day7;

import java.util.Scanner;

public class Average {
	public static void avg(int a1[])
	{
		float sum=0;
		float avg;
		for(int i=0;i<a1.length;i++)
		{
			sum=sum+a1[i];
		}
		avg=sum/a1.length;
		System.out.println(avg);
		//return avg;
	}

	public static void main(String[] args) {
		int a[]=new int[7];
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Average.avg(a);

	}

}
