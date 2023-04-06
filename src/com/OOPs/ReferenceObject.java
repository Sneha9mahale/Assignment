package com.OOPs;
//5) Write a program for class and object : (initialization through reference)
class Student1{
	int id;
	String name;
}
public class ReferenceObject {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.id=11;
		s.name="Hitshree";
		System.out.println(s.id);
		System.out.println(s.name);

	}

}
