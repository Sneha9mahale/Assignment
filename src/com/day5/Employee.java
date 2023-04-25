package com.day5;

import java.util.Scanner;
class mydate
{
	int day;
	String month;
	int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
class dept
{
	int dept_id;
	String dept_name;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
}

public class Employee {
	int eid;
	String ename;
	float salary;
	dept d;
	mydate md;
	

	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public dept getD() {
		return d;
	}


	public void setD(dept d) {
		this.d = d;
	}


	public mydate getMd() {
		return md;
	}


	public void setMd(mydate md) {
		this.md = md;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Details : ");
		System.out.println("Enter Employee Id : ");
		int id=sc.nextInt();
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
		Employee e=new Employee();
		e.setEid(id);
		e.setEname(nm);
		e.setSalary(sly);
		e.setD(new dept());
		e.setMd(new mydate());
		e.getD().setDept_id(did);
		e.getD().setDept_name(dnm);
		e.getMd().setDay(mday);
		e.getMd().setMonth(mon);
		e.getMd().setYear(yr);
		System.out.println("Employee Id : "+e.getEid()+","+"  Name : "+e.getEname()+","+" Salary : "+e.getSalary());
		System.out.println("Department Id : "+e.getD().getDept_id()+","+" Name : "+e.getD().getDept_name());
		System.out.println("Day : "+e.getMd().getDay()+","+" Month : "+e.getMd().getMonth()+","+" Year : "+e.getMd().getYear());
	}

}
