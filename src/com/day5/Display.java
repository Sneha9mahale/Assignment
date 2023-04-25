package com.day5;

class DisplayM{
	public void DisplayMet()
	{
		System.out.println("This is Parent Class");
	}
}
class View extends DisplayM{
	public void viewM()
	{
		System.out.println("This is Child Class");
	}
}
public class Display {
	public static void main(String[] args) {
//		DisplayM d=new DisplayM();
//		d.DisplayMet();
		View v=new View();
		v.viewM();
		v.DisplayMet();

	}

}
