package com.Pattern;

public class Eleven {

	public static void main(String[] args) {
		for(char ch='A';ch<='F';ch++)
		{
		for(char c='F';c>=ch;c--)
		{
			System.out.print(c);
			System.out.print(" ");
		}
		System.out.println();
		}

	}

}
