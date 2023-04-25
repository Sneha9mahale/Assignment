package com.day5;
import java.util.Scanner;
class JoiningD
{
	int day;
	String month;
	int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
class Job
{
	int jobid;
	String jobProfile;
	JoiningD jd;
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getJobProfile() {
		return jobProfile;
	}
	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}
	public JoiningD getJd() {
		return jd;
	}
	public void setJd(JoiningD jd) {
		this.jd = jd;
	}
	
}
public class Person {
	int id;
	String name;
	Job j;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Job getJ() {
		return j;
	}


	public void setJ(Job j) {
		this.j = j;
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
		Person p=new Person();
		//Job jb=new Job();
		//JoiningD jg=new JoiningD();
		p.setId(pid);
		p.setName(pnm);
		//p.setJ(jb);
//		jb.setJobid(jid);
//		jb.setJobProfile(jprf);
//		jb.setJd(jg);
//		jg.setDay(dy);
//		jg.setMonth(mn);
//		jg.setYear(yr);
//		System.out.println("Person name : "+p.)
		p.setJ(new Job());
		p.getJ().setJobid(jid);		
		p.getJ().setJobProfile(jprf);
		p.getJ().setJd(new JoiningD());
		p.getJ().getJd().setDay(dy);
		p.getJ().getJd().setMonth(mn);
		p.getJ().getJd().setYear(yr);
		System.out.println("Person id : "+p.getId()+","+" Name : "+p.getName()+","+" JobId : "+p.getJ().getJobid()+","+" Profile : "+p.getJ().getJobProfile()+","+" Joing Day : "+p.getJ().getJd().getDay()+","+" Month : "+p.getJ().getJd().getMonth()+","+" year : "+p.getJ().getJd().getYear());
	}

}
