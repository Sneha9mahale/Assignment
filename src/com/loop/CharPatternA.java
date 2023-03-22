package com.loop;

public class CharPatternA {

	public static void main(String[] args) {
		for(char ch='A';ch<='I';ch++)
		{
			for(char c='A';c<=ch;c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
