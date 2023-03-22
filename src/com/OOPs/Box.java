package com.OOPs;

public class Box {
	int l,v;
	int h,w;
	public static void main(String[] args) {
		Box b=new Box();
		b.l=2;
		b.w=5;
		b.h=7;
		b.v=b.l*b.h*b.w;
		System.out.println(b.v);

	}

}
