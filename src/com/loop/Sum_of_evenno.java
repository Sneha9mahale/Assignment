package com.loop;
//6.	 Write a Java program to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class Sum_of_evenno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth term:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum = "+sum);

	}

}
