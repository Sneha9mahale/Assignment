package com.constructor;

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
//	Paremeterised()
//	{
//		accountno=14567654;
//		customerName="sneha mahale";
//		System.out.println(accountno);
//		System.out.println(customerName);
//		System.out.println("I am in default constructor");
//	}


	public static void main(String[] args) {
	Paremeterised p=new Paremeterised(12345,"sneha mahale");
	Paremeterised p1=new Paremeterised(45678,"Kalpna Koli");
	//Paremeterised p2=new Paremeterised();
	}
}

