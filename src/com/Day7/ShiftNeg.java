package com.Day7;

import java.util.Arrays;

public class ShiftNeg {
	static void shiftele(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
		
	

	public static void main(String[] args) {
		int a[]= {-3,-5,4,7,1};
		ShiftNeg.shiftele(a);
		System.out.println(Arrays.toString(a));

	}

}
