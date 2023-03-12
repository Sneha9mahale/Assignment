package com.OOPs;

class Student{
	int id;
	String name;
}
public class MutipleObject {

	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		s.id=11;
		s.name="Hitshree";
		s1.id=13;
		s1.name="Neha";
		s2.id=15;
		s2.name="Sneha";
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s2.id);
		System.out.println(s2.name);
	}

}
