package com.day2;

public class Prime_number {

	public static void main(String[] args) {
		for(int num=1;num<=50;num++)
		{
			boolean isprime=true;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isprime=false;
				}
			}
			if(isprime==true)
			{
				System.out.println(num);
			}
		}
		
	}

}
