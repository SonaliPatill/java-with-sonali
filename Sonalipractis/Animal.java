package Sonalipractis;

abstract class Abstract
{
	abstract void sound();
}
public class Animal extends Abstract
{
public void sound()
{
	System.out.println("bhau!! bhau!!");	
}
	public static void main(String[] args) {
		Animal aa=new Animal();
		aa.sound();
	}
}

