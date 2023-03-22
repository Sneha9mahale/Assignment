package com.loop;
//11.	Find all prime number between 400 to 300;
public class Prime_num {

	public static void main(String[] args) {
		for(int num=400;num>=300;num--)
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
