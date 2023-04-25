package com.day5;

class Kid
{
	int a,b;
	public void readBook()
	{
		System.out.println("Book is read by kid ");
	}
	public void readBook(int a,int b)
	{
		System.out.println("A Value Is : "+ a + ", B Value Is : "+b);
	}
}
class BigKid extends Kid
{
	public void readBook()
	{
		super.readBook();
		System.out.println("Book is read by big kid ");
		
	}
}
class Teenager extends Kid
{
	public void readBook()
	{
		System.out.println("Book is read by Teenager ");
	}
}
public class Book {

	public static void main(String[] args) {
		BigKid k1=new BigKid();
		Teenager k2=new Teenager();
		k1.readBook();
		k1.readBook(5, 7);
		k2.readBook();

	}

}
