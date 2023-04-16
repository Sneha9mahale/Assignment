package com.day4;

public class IntChar {
	public void intChar(int a,char c)
	{
		System.out.println("Integer : "+a);
		System.out.println("Character : "+c);
	}
	public void intChar(char c,int a )
	{
		System.out.println("Character : "+c);
		System.out.println("Integer : "+a);

	}

	public static void main(String[] args) {
		IntChar i=new IntChar();
		i.intChar(1, 'h');
		i.intChar('m', 2);

	}

}
