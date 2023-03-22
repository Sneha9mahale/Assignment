package com.OOPs;

public class Object_another {
	int id=11;
	String name="dipak";
	public static void main(String[] args) {
		Object_another ob=new Object_another();
		Object_another ob1=ob;
		System.out.println(ob.id);
		System.out.println(ob.name);
		System.out.println(ob1.id);
		System.out.println(ob1.name);

	}

}
