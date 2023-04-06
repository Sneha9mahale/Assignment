package com.Method;
import java.util.Scanner;
public class Square {
	
	
	public void squ()
	{
		int num=5;
		int sq=num*num;
		System.out.println(sq);
	}
	public void mul(int a)
	{
		int s=a*a;
		System.out.println(s);
	}
	public int sqr()
	{
		int n=7;
		int multi=n*n;
		return multi;
	}
	public int sum(int b)
	{
		int ss=b*b;
		return ss;
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number : ");
//		int num=sc.nextInt();
		Square s=new Square();
		s.squ();
		s.mul(6);
		int twice=s.sqr();
		System.out.println(twice);
		int multiple=s.sum(8);
		System.out.println(multiple);

	}

}
