package Sonalipractis;

import java.util.Scanner;

public class votingeligibility 
 {
	 public static void main(String[] args) 
	 {
	  
	    int age;
	  
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter your age: ");
	    age = sc.nextInt();
	    
	  
	    if(age>=18)
	    {
	        System.out.println("Congratulations!! You are eligible for voting.");
	    }
	    else
	    {
	    System.out.println("Sorry,You can vote. you are under 18");
	    }
	 }
	}
