package Sonalipractis;

abstract class normal
{
	public void Display()
	
		{
			System.out.println("this is normal method");	
		}
	abstract public void disp();
	}
 class abstrandnormal extends normal
{
	public void disp()
	{
		System.out.println("this is body of abstract method");

	}
	public static void main(String[] args)
	{
		abstrandnormal ab=new  abstrandnormal();
ab.Display();
ab.disp();
	}

}