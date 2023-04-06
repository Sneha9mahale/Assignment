package com.Method;

public class StudentR {
int id=1;
public void pass()
{
	id=2;
	
}
	public static void main(String[] args) {
		StudentR r=new StudentR();
		r.pass();
		System.out.println(r);
		System.out.println("id = "+r.id);

	}

}
