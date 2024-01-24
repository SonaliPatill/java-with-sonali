package Sonalipractis;

import java.util.ArrayList;

public class Arrylist {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("pratiksha");
		a1.add("komal");
		a1.add("manasi");
		System.out.println(a1);
		ArrayList<String>a2=new ArrayList<String>();
		a2.add("sonali");
		a2.add("harshada");
		a2.add("Anjali");
System.out.println(a2);
a1.addAll(a2);
System.out.println(a1);

	}

}