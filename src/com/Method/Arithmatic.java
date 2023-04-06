package com.Method;

public class Arithmatic {

	
		public void add(int x,int y)
		{
			int sum=x+y;
			System.out.println("addition = "+sum);
		}
		public void subs(int a,int b)
		{
			int s=a-b;
			System.out.println("substraction = "+s);
		}
		public void multi(int c,int d)
		{
			int m=c*d;
			System.out.println("multiplication = "+m);
		}
		public void division(double p,double q )
		{
			double d=p/q;
			
			System.out.println("Division = "+d);
		}
		public static void main(String[] args) {
			Arithmatic ar=new Arithmatic();
			ar.add(5,11);
			ar.subs(89, 23);
			ar.multi(3, 15);
			ar.division(56, 5);
			
	}

}
