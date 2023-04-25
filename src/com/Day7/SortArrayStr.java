package com.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayStr {

	public static void main(String[] args) {
		String a[]=new String[7];
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		System.out.println(Arrays.toString(a));

	}

}
