package com.Method;

public class Stude {
	int id;
	String name;
	public void setCustomData(int id,String name)
	{
		int customId=id;
		String customName=name;
		System.out.println("id = "+id);
		System.out.println("name = "+name);
	}

	public static void main(String[] args) {
		Stude s=new Stude();
		s.setCustomData(1,"sneha");
		System.out.println("id = "+s.id);
		System.out.println("name = "+s.name);
		

	}

}
