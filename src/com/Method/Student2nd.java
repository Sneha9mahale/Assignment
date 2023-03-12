package com.Method;

public class Student2nd {

	public int getid()
	{
		int id=11;
		return id;
	}
	public void display()
	{
		//getid();
		
		System.out.println("In display mode");
	}
	public static void main(String[] args) {
		Student2nd s=new Student2nd();
		int ge=s.getid();
		System.out.println(ge);
		s.display();
				

	}

}
