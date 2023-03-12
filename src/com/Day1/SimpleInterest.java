package com.Day1;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle :");
		int prin=sc.nextInt();
		System.out.println("Enter Rate :");
		int rate=sc.nextInt();
		System.out.println("Enter Time  :");
		int time=sc.nextInt();
		float si;
		si=(prin*rate*time)/100;
		System.out.println("simple interest = "+si);
		

	}

}
