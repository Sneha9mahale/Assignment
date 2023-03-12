package com.Method;

public class Student {
		int id=11;
		String name="Sneha";
	public void display()
	{
		int id=12;
		String name="Pooja";
		System.out.println("id = "+id+"name: "+name);
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.display();

	}

}
