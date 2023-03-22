package com.loop;
import java.util.Scanner;
//WAP to accept base and index from user and calculates power
public class Power_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base");
		int base=sc.nextInt();
		System.out.println("Enter the exponent");
		int expo=sc.nextInt();
		
		int i=1;
		int power=1;
		while(i<=expo)
		{
			power=power*base;
			i++;
		}
		System.out.println(power);
	}

}
