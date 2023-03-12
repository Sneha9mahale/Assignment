package com.Day1;
import java.util.Scanner;
public class DaystoYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Days");
		int day=sc.nextInt();
		int year=day/365;
		int week=(day-(year*365))/7;
		int days=day-((year*365)+(week*7));
		System.out.println("year = "+year+" week = "+week+" days = "+days);

	}

}
