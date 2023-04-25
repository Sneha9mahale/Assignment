package com.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Same {

	public static void main(String[] args) {
		int a[]=new int[6];
		System.out.println("Enter Element");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		boolean issame=false;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					 issame=true;
					 System.out.println("same");
					 break;
				}
			}
		}
		if(issame=false)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int k=i-1;k>=0;k--)
				{
					if(a[i]==a[k])
					{
						System.out.println("same");
					}
					else
					{
						System.out.println("not same");
					}
				}
			}
		}
			
		
	}

}
