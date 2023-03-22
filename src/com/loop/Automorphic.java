package com.loop;
import java.util.Scanner;
public class Automorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		int sq=num*num;
		System.out.println(sq);
		int power=1;
		for(int i=1;i<=count;i++)
		{
			power=power*10;
		}
		int end=sq % power;
		System.out.println(num+" "+end);
		
		if(num==end)
		{
			System.out.println("numbre is automorphic");
		}
		else
		{
			System.out.println("numbre is not automorphic");
		}
		
	}

}
