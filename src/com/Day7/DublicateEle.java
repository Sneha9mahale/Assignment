package com.Day7;

import java.util.Scanner;

public class DublicateEle {
	public static void dublicate(int a1[])
	{
		boolean isvisited=false;
		int total=0;
		for(int i=0;i<a1.length;i++)
		{
			isvisited=false;
			int count=1;
			for(int k=i-1;k>=0;k--)
			{
				if(a1[k]==a1[i])
				{
					isvisited=true;
					break;
				}
			}
			
			if(isvisited==false)
			{
					for(int j=i+1;j<a1.length;j++)
					{
						if(a1[i]==a1[j])
						{
							count++;
						}
					}
					if(count==2)
					{
						System.out.println("Dublicate Elements : ");
						System.out.println(a1[i]);
						total++;
					}
			}
			}
		System.out.println("total Dublicate Elements : "+total);
			
		}
		
		
	

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		DublicateEle.dublicate(a);

	}

}
