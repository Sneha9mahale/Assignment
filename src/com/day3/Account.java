package com.day3;
import java.util.Scanner;
public class Account {
	int no;
	String name;
	int mobno;
	int bal;

	public void insert(int n,String nm,int mbno,int b)
	{
		no=n;
		name=nm;
		mobno=mbno;
		bal=b;
	}
	public void display()
	{
		System.out.println("account no = "+no);
		System.out.println("account Holder Name = "+name);
		System.out.println("account Mobile number = "+mobno);
		System.out.println("Balance = "+bal);
	}
	public void deposit(int d)
	{
		 bal=bal+d;
		 System.out.println("balance : "+bal);
	}
	public void withdraw(int w)
	{
		bal=bal-w;
		System.out.println("balance : "+bal);
	}
	public void checkbalance()
	{
		System.out.println("balance : "+bal);
	}
	public static void main(String[] args) {
		Account a= new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no : ");
		int n=sc.nextInt();
		System.out.println("enter name :");
		String nm=sc.next();
		System.out.println("enter mobile no :");
		int mbno=sc.nextInt();
		System.out.println("enter balance : ");
		int b=sc.nextInt();
		a.insert(n,nm,mbno,b);
		a.deposit(1000);
		a.withdraw(500);
		a.checkbalance();
		a.display();
	}

}
