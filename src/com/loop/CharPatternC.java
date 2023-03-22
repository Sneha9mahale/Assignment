package com.loop;

public class CharPatternC {

	public static void main(String[] args) {
		for(char c='A';c<='I';c++)
		{
			for(char j='I';j>c;j--)
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
