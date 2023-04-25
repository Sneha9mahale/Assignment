package com.day5;

import java.util.Scanner;

class Department
{
	int id;
	String dname;
	Department()
	{}
	Department(int id,String dname)
	{
		this.id=id;
		this.dname=dname;
	}
	public void showDeptDetails()
	{
		System.out.println("Dept id : "+id);
		System.out.println("Dept name : "+dname);
	}
}
public class Student {
	int roll;
	String name;
	Department d;
	Student()
	{
	}
	Student(int roll,String name,Department d)
	{
		this.roll=roll;
		this.name=name;
		this.d=d;
	}
	public void showDetails()
	{
		System.out.println("Student roll No : "+roll);
		System.out.println("Student Name : "+name);
		d.showDeptDetails();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Details : ");
		System.out.println("Enter Student roll No : ");
		int rn=sc.nextInt();
		System.out.println(" Enter Student Name : ");
		String nm=sc.next();
		System.out.println("Depart Details : ");
		System.out.println("Enter DEpt id : ");
		int did=sc.nextInt();
		System.out.println("Enter Dept dnm : ");
		String dnm=sc.next();
		Department de=new Department(did,dnm);
		Student s=new Student(rn,nm,de);
		s.showDetails();
		
	}

}
