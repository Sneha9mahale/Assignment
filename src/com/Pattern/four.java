package com.Pattern;

public class four {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i;k>1;)
			{
				System.out.print(--k);
			}
			System.out.println();
		}
		for(int l=4;l>=1;l--)
		{
			for(int m=1;m<=l;m++)
			{
				System.out.print(m);
			}
			for(int n=l;n>1;)
			{
				System.out.print(--n);
			}
			System.out.println();
		}
	}

	}

