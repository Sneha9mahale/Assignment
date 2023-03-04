package com.Pattern;

public class Ten {

	public static void main(String[] args) {
		for(char c='A';c<='F';c++)
		{
			for(char j='F';j>c;j--)
			{
				System.out.print(" ");
			}
			for(char k='A';k<=c;k++)
			{
			System.out.print(k);
			System.out.print(" ");
			}
			System.out.println();
		}

	}

}
