package com.switcha;
import java.util.Scanner;
public class Greatestnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		int max;
		if(a>b)
		{
			 max=0;
		}
		else 
		{
			max=1;
		}
	
		switch(max)
		{
		case 0 :
			System.out.println("num1 is greater");
			break;
		case 1:
			System.out.println("num2 is greater");
			break;
		default :
			System.out.println("Both are equal");
		}

	}
}
