package com.day5;

import java.util.Scanner;
class MydateC
{
	int day;
	String month;
	int year;
	public MydateC(int day, String month, int year) {
		//super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void dateShowDetails()
	{
		System.out.println(" Day : "+day);
		System.out.println(" Month  : "+month);
		System.out.println(" Year : "+year);
	}
	
}
class DeptC
{
	int dep_id;
	String dep_name;
	public DeptC(int dep_id, String dep_name) {
		super();
		this.dep_id = dep_id;
		this.dep_name = dep_name;
	}
	public void depShowDetails()
	{
		System.out.println("Department Id : "+dep_id);
		System.out.println("Department Name : "+dep_name);
	}
	
}
 class EmployeeC {
	int id;
	String enm;
	float salary;
	DeptC d;
	MydateC my;
	EmployeeC(int id,String enm,float salary,DeptC d,MydateC my)
	{
		this.id=id;
		this.enm=enm;
		this.salary=salary;
		this.d=d;
		this.my=my;
	}
	public void showDetails()
	{
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+enm);
		System.out.println("Employee Salary : "+salary);
		d.depShowDetails();
		my.dateShowDetails();
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Details : ");
		System.out.println("Enter Employee Id : ");
		int eid=sc.nextInt();
		System.out.println("Enter Employee Name : ");
		String nm=sc.next();
		System.out.println("Enter Employee Salary : ");
		float sly=sc.nextFloat();
		System.out.println("Enter Department Details : ");
		System.out.println("Enter Department Id : ");
		int did=sc.nextInt();
		System.out.println("Enter Department Name : ");
		String dnm=sc.next();
		System.out.println("Enter Mydate Details : ");
		System.out.println("Enter Day : ");
		int mday=sc.nextInt();
		System.out.println("Enter Month : ");
		String mon=sc.next();
		System.out.println("Enter Year : ");
		int yr=sc.nextInt();
		DeptC de=new DeptC(did, dnm);
		MydateC m=new MydateC(mday, mon, yr);
		EmployeeC emp=new EmployeeC(eid, nm, sly,de,m);
		emp.showDetails();
		

	}

}
