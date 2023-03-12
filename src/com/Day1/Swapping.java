package com.Day1;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		/*int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("num1 = "+num1+" num2 ="+num2);*/
		
		//2nd method
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1 = "+num1+" num2 ="+num2);
	}

}
