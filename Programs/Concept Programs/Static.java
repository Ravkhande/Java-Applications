
import java.lang.*;

class Hello
{
	public int i;          //instance variable
	public static int j;      //class variable
	
	static
	{
		System.out.println("Inside first static");
	}
	
	static
	{
		System.out.println("Inside second static");
		j=21;  //allowed
	}
	
	public Hello()
	{
		System.out.println("Inside constructor");
		i=11;
		j=31; //Avoid to do this because it changes the value of static characteristics
		
	}
	
	public void fun()      //instance method
	{
		
		System.out.println("Inside fun"+j);
		System.out.println("Inside fun"+i);
	}
	
	public static void gun()       //class method
	{
		//static int i=34;   //NA
		System.out.println("Inside gun");
	}
}

class Static
{
	static
	{
		System.out.println("Inside static of Demo");
	}
	
	public static void main(String brr[])
	{
		System.out.println("Inside main");
		
		Hello.gun();
		System.out.println("value of j"+Hello.j);
		
		Hello hobj=new Hello();
		hobj.fun();
		System.out.println("Value of i"+hobj.i);
	}
}

		
	
		
		