package com.day5;

import java.util.Scanner;
class DepartmentSec
{
	int drolln;
	String dname;
	public int getDrolln() {
		return drolln;
	}
	public void setDrolln(int drolln) {
		this.drolln = drolln;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
}

public class StudentSec {
	int rollno;
	String sname;
	DepartmentSec dept;
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public String getSname()
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public DepartmentSec getDept()
	{
		return dept;
	}
	public void setDept(DepartmentSec dept)
	{
		this.dept=dept;
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
		StudentSec s=new StudentSec();
		//DepartmentSec d=new DepartmentSec();
		s.setRollno(rn);
		s.setSname(nm);
		//or
		s.setDept(new DepartmentSec());
		s.getDept().setDname(dnm);
		s.getDept().setDrolln(did);
	//		s.setDept(d);
//		d.setDname(dnm);
//		d.setDrolln(did);
		System.out.println("Student Roll No : "+s.getRollno()+" Student Name : "+s.getSname()+" Department id : "+s.getDept().getDrolln()+" Department Name : "+s.getDept().getDname());
	}

}
