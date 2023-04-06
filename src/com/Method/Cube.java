package com.Method;

public class Cube {

		public void squ()
		{
			int num=5;
			int cu=num*num*num;
			System.out.println(cu);
		}
		public void mul(int a)
		{
			int s=a*a*a;
			System.out.println(s);
		}
		public int sqr()
		{
			int n=7;
			int multi=n*n*n;
			return multi;
		}
		public int sum(int b)
		{
			int ss=b*b*b;
			return ss;
		}
		public static void main(String[] args) {
			Cube c=new Cube();
			c.squ();
			c.mul(6);
			int twice=c.sqr();
			System.out.println(twice);
			int multiple=c.sum(8);
			System.out.println(multiple);

	}

}
