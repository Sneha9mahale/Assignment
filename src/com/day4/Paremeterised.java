package com.day4;

public class Paremeterised {
	int accountNo;
	String customerName;
	Paremeterised(int accountNo,String customerName)
	{
		this.accountNo=accountNo;
		this.customerName=customerName;
		System.out.println(accountNo);
		System.out.println(customerName);
		System.out.println("I am in parameterised Constructor");
	}


	public static void main(String[] args) {
	Paremeterised p=new Paremeterised(12345,"sneha mahale");
	
	}
}

