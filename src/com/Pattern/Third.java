package com.Pattern;

public class Third {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				continue;
				System.out.print(j);
			}
			if(i%2==0)
			continue;
			System.out.println();	
		}
		for(int k=8;k>=1;k--)
		{
			for(int h=1;h<=k;h++)
			{
				if(k%2==0)
				continue;
				System.out.print(h);
			}
			if(k%2==0)
			continue;
			System.out.println();
		}

	}

}
