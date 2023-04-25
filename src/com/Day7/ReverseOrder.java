package com.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		int a[]=new int[10];
		int b[]=new int[10];
		System.out.println("Enter Element");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		System.out.println("Reverse String");
		System.out.println(Arrays.toString(b));
	}

}
