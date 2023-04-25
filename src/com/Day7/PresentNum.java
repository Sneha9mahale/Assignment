package com.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class PresentNum {

	public static void main(String[] args) {
		int a[]=new int[10] ;
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	
		
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		boolean isvisited=false;
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println("Number is Present");
				isvisited =true;
			}
		}
		if(isvisited==false)
		{
			System.out.println("Number is not Present");
		}
		
		

	}

}
