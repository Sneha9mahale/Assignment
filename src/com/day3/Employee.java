package com.day3;

public class Employee {
	private int id;
	private String name;
	private float salary;
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public float getSalary()
	{
		return salary;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(11);
		e.setName("Sneha");
		e.setSalary(40000);
		System.out.println("Id : "+e.getId()+" Name : "+e.getName()+" Salary = "+e.getSalary());

	}

}
