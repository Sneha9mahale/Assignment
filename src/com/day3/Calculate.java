package com.day3;

public class Calculate {
	
	public int add(int x,int y)
	{
		return x+y;
	}
	public int subs(int a,int b)
	{
		int s=a-b;
		return s;
	}
	public int multi(int c,int d)
	{
		int m=c*d;
		return m;
	}
	public double division(double p,double q )
	{
		double d=p/q;
		return d;
		//System.out.println("Division = "+d);
	}
	public static void main(String[] args) {
		Calculate c=new Calculate();
		int addition=c.add(4,7);
		int substraction=c.subs(8, 6);
		int multiplication=c.multi(5, 6);
		double divi=c.division(10.0,3.0);
		System.out.println("addition = "+addition);
		System.out.println("substraction = "+substraction);
		System.out.println("multiplication = "+multiplication);
		System.out.println("division = "+divi);
	}

}
