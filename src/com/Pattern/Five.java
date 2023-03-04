package com.Pattern;

public class Five {

	public static void main(String[] args) {
		System.out.println("*");
		for(int i=1;i<=5;i++)
		{
			System.out.print("*");
			for(int j=1;j<=i;j++)
			{ 
			
				System.out.print(j);
			}
			for(int k=i;k>1;)
			{
				System.out.print(--k);
			}
			System.out.print("*");
			System.out.println();
			
		}
		for(int l=4;l>=1;l--)
		{
			System.out.print("*");
			for(int m=1;m<=l;m++)
			{
				System.out.print(m);
			}
			for(int n=l;n>1;)
			{
				System.out.print(--n);
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.print("*");

	}

}
