package com.loop;
//WAP to print odd numbers from 521 to 229 using while loop
public class Odd_using_while {

	public static void main(String[] args) {
		int i=521;
		while(i>=229)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i--;
		}

	}

}
