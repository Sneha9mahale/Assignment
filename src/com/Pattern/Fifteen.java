package com.Pattern;

public class Fifteen {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(0);
				if(j==i)
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}

	}

}
