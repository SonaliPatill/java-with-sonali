package Sonalipractis;

import java.util.Scanner;



public class simpleInterest {
	int si,p,r,t;
	
	
	void input()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principle ");	
	p=sc.nextInt();
	System.out.println("Enter the rate ");	
	r=sc.nextInt();
	System.out.println("Enter the time ");	
	t=sc.nextInt();
	}
	void display()
	
	{
		si=p*r*t;
		System.out.println("simple interest "+si);	
	}
	
	public static void main(String[] args)
	{
		simpleInterest ss=new  simpleInterest();
		 ss.input();
		 ss.display();
	}
}
