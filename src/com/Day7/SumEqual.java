package com.Day7;

import java.util.Scanner;

public class SumEqual {

	public static void main(String[] args) {
		int a[]= {4, 6, 5, -10, 8, 5, 20};
		System.out.println("Enter Num : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==num)
				{
					System.out.println(a[i]+ " + "+a[j] +" = " +num);
				}
			}
			
		}
	}

}
