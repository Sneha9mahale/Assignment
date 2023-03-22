package com.loop;

public class PatternD {

	public static void main(String[] args) {
		for(int i=1;i<=16;i++)
		{
			for(int j=16;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			if(i%2==0)
			{
				break;
			}
			System.out.print("*");
			System.out.print(" ");
			System.out.println();
			}
		}
		for(int i=15;i>=1;i--)
		{
			for(int j=15;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i%2==0)
				{
					break;
				}
			System.out.print("*");
			System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}

