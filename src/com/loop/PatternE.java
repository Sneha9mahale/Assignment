package com.loop;

public class PatternE {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
