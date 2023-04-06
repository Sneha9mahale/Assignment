package com.day3;

public class Student {
	private int rollno;
	public int admissionno;
	int age;
	protected int courseid;
	private void doPrivate()
	{
		System.out.println("In private method");
	}
	public void doPublic(int rno,int adno,int ag)
	{
		rollno=rno;
		admissionno=adno;
		age=ag;
		doDefault();
	}
	void doDefault()
	{
		System.out.println("rollno : "+rollno);
		System.out.println(" admission no = "+admissionno);
		System.out.println(" age = "+age);
	}
	protected void doProtected()
	{
		System.out.println("protected method");
	}
	public static void main(String[] args) {
//		Student s=new Student();
//		s.doPublic(11, 87, 22);
//		s.doPrivate();
//		s.doDefault();
//		s.doProtected();

	}

}
