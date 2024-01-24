package Sonalipractis;



import java.util.ArrayList;
import java.util.Scanner;

public class Arrylistfromuser  {

    public static void main(String[] args) {
	ArrayList sonali=new ArrayList();
Scanner sc=new Scanner(System.in);
System.out.println("enter a Array length");
int l=sc.nextInt();
for(int i=1;i<=l;i++)
{
	System.out.println("enter a no");
	sonali.add(sc.nextInt()); 
	}
System.out.println("ArayList = "+sonali);
 System.out.println("enter your choice");
		 int a=sc.nextInt();
		 System.out.println(a);
if (sonali.contains(a))
	{
	sonali.remove(a);
System.out.println(a+" is removed from ArrayList");	  
	}
	else
	{
		System.out.println(a+" is not present in  ArrayList");	
	}
	System.out.println();	
	System.out.println("Updated ArrayListArrayList = "+sonali);	
    }
}