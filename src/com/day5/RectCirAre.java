package com.day5;

import java.util.Scanner;

class Rectangle
{
	int leng;
	int bread;
	Rectangle(){}
	Rectangle(int leng,int bread)
	{
		//super();
		this.leng=leng;
		this.bread=bread;
	}
	public void area()
	{
		int a=leng*bread;
		System.out.println("Area Of Rectangle : "+a);
	}
	public void perimeter()
	{
		int p=2*(leng+bread);
		System.out.println("Perimeter Of Rectangle : "+p);
	}
}
class Square extends Rectangle
{
	int side;
	Square(int side)
	{
		super(side,side);
		this.side=side;
	}
	public void areas()
	{
		int s=side*side;
		System.out.println("Area Of Square : "+s);
	}
	
}
public class RectCirAre {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side Of Square : ");
		
		int sd=sc.nextInt();
		System.out.println("Enter length and breadth Of rectangle : ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		Square sq=new Square(sd);
		Rectangle r=new Rectangle(l,b);
		sq.areas();
		r.area();
		r.perimeter();

	}

}
