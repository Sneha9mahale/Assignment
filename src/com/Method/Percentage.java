package com.Method;

import java.util.Scanner;



public class Percentage {
	int id,p,c,m;
	float per,t;
	String name;
	public void accept(String nm,int ide,int m1,int m2,int m3)
	{
		name=nm;
		id=ide;
		p=m1;
		c=m2;
		m=m3;
	}
	public double percent()
	{
		t=p+c+m;
		per=t/3;
		return per;
		
	}
	public void display()
	{
		System.out.println("Name : "+name+ "id :"+id);
		System.out.println("Marks Details");
		System.out.println("Physics Marks : "+p);
		System.out.println("Chemistry Marks :"+c);
		System.out.println("Math Marks :"+m);
		System.out.println("Total :"+t);
		System.out.println("Percentage :"+per);
		
	}

	public static void main(String[] args) {
		Percentage pe=new Percentage();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		String nm=sc.next();
		System.out.println("Enter id");
		int ide=sc.nextInt();
		System.out.println("Enter Physics Marks");
		int m1=sc.nextInt();
		System.out.println("Enter Chemistry Marks");
		int m2=sc.nextInt();
		System.out.println("Enter Math Marks");
		int m3=sc.nextInt();
		pe.accept(nm,ide,m1,m2,m3);
		double percen=pe.percent();
		pe.display();

	}

}
