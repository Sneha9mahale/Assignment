package com.Day1;
import java.util.Scanner;
public class TotalMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five subject marks");
		int marks1=sc.nextInt();
		int marks2=sc.nextInt();
		int marks3=sc.nextInt();
		int marks4=sc.nextInt();
		int marks5=sc.nextInt();
		int t=marks1+marks2+marks3+marks4+marks5;
		float p=t/5;
		System.out.println("percentage="+p);

	}

}
