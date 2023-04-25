package com.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Replace9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%10==9)
			{
				a[i]=0;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
