package com.loop;

public class CahrPatternB {

	public static void main(String[] args) {
		for(char ch='A';ch<='J';ch++)
		{
			for(char c='A';c<=ch;c++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
