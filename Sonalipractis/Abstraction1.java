package Sonalipractis;

import java.util.Scanner;


abstract class AddSubb
{
	abstract public void add();
} 
 class Abstraction1 extends AddSubb
 {
	 int a,b,c;
	 
	 
	 public void add()
	 {
		 Scanner  sc=new Scanner(System.in);
		 System.out.println("enter a num 1");
		a=sc.nextInt();
		System.out.println("enter a num 2");
		b=sc.nextInt();
		c=a+b;
		 System.out.println("Addition ="+c);
		 System.out.println(" ");
	 }
	 
	 public void sub()
	 {
		 Scanner  sc=new Scanner(System.in);
		 System.out.println("enter a num 1");
		a=sc.nextInt();
		System.out.println("enter a num 2");
		b=sc.nextInt();
		 c=a-b;
		 System.out.println("substraction ="+c);
	 }
	public static void main(String[] args)
 {
		Abstraction1 bb=new Abstraction1();
		bb.add();
		bb.sub();
	}
}