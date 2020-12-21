
import java.lang.*;

class Demo
{
	
	public int no1;
	public double Interest;
	public static int i;
	
	 static
	 {
		 i=21;
		 System.out.println("Inside Static block");
	 }
	 
		 
	
	    {             //unnamed Block
		System.out.println("Inside unnamed Block");
		Interest=10.5;
		}
		  
	public Demo()
	{
			System.out.println("Inside Default constructor");
         no1=0;
	}

     public Demo(int x)
	{
			System.out.println("Inside Parametrized constructor");
         no1=x;
	}  	
		
	
}


class Unnamed
{
	public static void main(String args[])
	{
		Demo obj1=new Demo();
		Demo obj2=new Demo(11);
		
	}
}

		
		