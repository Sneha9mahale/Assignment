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
	}


	public static void main(String[] args) {
	Paremeterised p=new Paremeterised(12345,"sneha mahale");
	
	}
}

