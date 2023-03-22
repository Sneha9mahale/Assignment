package com.loop;
//WAP to print even numbers from 121 to 229 using do-while loop
public class Even_using_Dowhile {

	public static void main(String[] args) {
		int i=121;
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=229);

	}

}
