package Sonalipractis;


import java.util.ArrayList;
import java.util.Iterator;

public class array 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println("ArrayList="+a);
		Iterator itr =a.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
		}
			
		

	}



