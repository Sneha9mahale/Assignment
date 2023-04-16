package com.day4;

public class Cycle {
	int accountNO;
	int wheelsNo;
	 Cycle() {
		System.out.println("I am in default Constructor");
	}
	 Cycle(int accountNo,int wheelsNo)
	 {
		 this();
		 this.accountNO=accountNo;
		 this.wheelsNo=wheelsNo;
		
		 System.out.println("I am in another constructor");
		 
	 }
	public static void main(String[] args) {
		Cycle c=new Cycle();
		Cycle c1=new Cycle(345,3);

	}

}
