package com.day5;

class StudentH
{
	int id;
	String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class StudHash {

	public static void main(String[] args) {
		StudentH s=new StudentH();
		//Student s1=new Student();
		StudentH s1=s;
		System.out.println("Hashcode : "+s);
		System.out.println("Hashcode : "+s1);

	}

}
