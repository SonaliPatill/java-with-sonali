package Sonalipractis;

import java.util.Scanner;
class MaxBetTwoNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter the Number1 : ");
		 num1 = sc.nextInt();
		System.out.print("Enter the Number2 : ");
		 num2 = sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Maximum Number is " +num1);
		}
		else if(num1<num2)
		{
			System.out.println("Maximum Number is " +num2);
		}
		else
		{
			System.out.println("Both are Equal " +num1);
		}
	}
}