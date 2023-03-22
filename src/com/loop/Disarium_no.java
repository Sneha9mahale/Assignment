package com.loop;
//	Disarum no
import java.util.Scanner;

public class Disarium_no {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num=sc.nextInt();
		int temp=num;
		int count =0;
		int sum=0;
		
		
		while(num>0)
		{
			int r=num%10;
			++count;
			num=num/10;	
		}
		System.out.println("No of digit="+count);
		num=temp;
		
		for(int i=1;i<=count;i++)
		{
			int pro=1;
			int re=num%10;
			for(int j=3;j>=i;j--)
			{
			pro=pro*re;
			}
			sum=sum+pro;
			num=num/10;
			System.out.println(sum);
		}
		num=temp;
		if(num==sum)
		{
			System.out.println("Number is disarium");
		}
		else
		{
			System.out.println("Number is not disarium");
		}

	}

}
