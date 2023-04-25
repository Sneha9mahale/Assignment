package com.day5;

import java.util.Scanner;

class JoiningC
{
	int day;
	String month;
	int year;
	public JoiningC(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void showJoiningDetails()
	{
		System.out.println("Day : "+day);
		System.out.println("Month : "+month);
		System.out.println("Year : "+year);
	}
	
}
class JobC
{

	int jobid;
	String jobProfile;
	JoiningC jd;
	public JobC(int jobid, String jobProfile, JoiningC jd) {
		super();
		this.jobid = jobid;
		this.jobProfile = jobProfile;
		this.jd = jd;
	}
	public void showJobDetails()
	{
		System.out.println(" Job Id : "+jobid);
		System.out.println("Job Profile : "+jobProfile);
		jd.showJoiningDetails();
	}
	
}
public class PersonC {
	int id;
	String name;
	JobC j;
	

	public PersonC(int id, String name, JobC j) {
		super();
		this.id = id;
		this.name = name;
		this.j = j;
	}
	
	public void showPersonDetails()
	{
		System.out.println("Person Id : "+id);
		System.out.println("Person Name : "+name);
		j.showJobDetails();
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person Details : ");
		System.out.println("Enter id : ");
		int pid=sc.nextInt();
		System.out.println("Enter Name : ");
		String pnm=sc.next();
		System.out.println("Enter Job Details : ");
		System.out.println("Enter jobid : ");
		int jid=sc.nextInt();
		System.out.println("Enter job Profile : ");
		String jprf=sc.next();
		System.out.println("Enter Joining Details : ");
		System.out.println("Joining Day : ");
		int dy=sc.nextInt();
		System.out.println("Month : ");
		String mn=sc.next();
		System.out.println("year : ");
		int yr=sc.nextInt();
		JoiningC ji=new JoiningC(dy, mn, yr);
		JobC jbc=new JobC(jid,jprf,ji);
		PersonC pr=new PersonC(pid,pnm,jbc);
		pr.showPersonDetails();
		
	}

}
