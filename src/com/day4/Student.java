package com.day4;

public class Student {

	public void set_Info(String name,int age)
	{
		System.out.println("Name of Student : "+name);
		System.out.println("Age of Student : "+age);
		
	}
	public void set_Info(String name,int age,String address)
	{
		System.out.println("Name of Student : "+name);
		System.out.println("Age of Student : "+age);
		System.out.println("Address Of Student : "+address);
	}
	

	public static void main(String[] args) {
		Student s=new Student();
		s.set_Info("Mr.X",20);
		s.set_Info("Mr.Y",23,"Pune");

	}

}
