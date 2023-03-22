package com.Day7;

import java.util.Scanner;
import java.util.Arrays;
public class IntegerInput {

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
	}

}
