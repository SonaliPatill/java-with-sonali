package Sonalipractis;

import java.util.Scanner;

public class NumIsPositiveOrNegative 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");	
		num=sc.nextInt();
		
		if (num>=1) {
			System.out.println(" number is possitive");
		}
		else if (num==0)
		{
			System.out.println("number is zero");	
		}
			else	
			{
				System.out.println("number is negative");		
			}
	}

}