package com.constructor;

public class Account {
	public long accountno;
	public String customerName;
	Account()
	{
	System.out.println(accountno);
	System.out.println(customerName);
	}
//	Account()
//	{
//		accountno=14567654;
//		customerName="sneha mahale";
//		System.out.println(accountno);
//		System.out.println(customerName);
//		System.out.println("I am in default constructor");
//	}

	public static void main(String[] args) {
		Account a=new Account();
		Account b=new Account();
		

	}

}
