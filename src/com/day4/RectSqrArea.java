package com.day4;

public class RectSqrArea {
public void area(int l,int b)
{
	System.out.println("Area Of rectangle : ");
	int ar=l*b;
	System.out.println(ar);
}

public void area(float s)
{
	System.out.println("Area Of Square :");
	float as=s*s;
	System.out.println(as);
}
	

	public static void main(String[] args) {
		RectSqrArea r=new RectSqrArea();
		r.area(5,6);
		r.area(4.5f);

	}

}
