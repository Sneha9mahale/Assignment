package com.OOPs;

public class Marks {
 int sci,math,eng,t;
 float p;
	public static void main(String[] args) {
		Marks m=new Marks();
		m.sci=56;
		m.math=78;
		m.eng=79;
		m.t=m.sci+m.math+m.eng;
		m.p=m.t/3;
		if(m.p>=70)
		{
			System.out.println("1st class");
		}
		else if(m.p>=50&&m.p<=70)
		{
			System.out.println("2st class");
		}
		else
		{
			System.out.println("Pass");
		}

	}

}
