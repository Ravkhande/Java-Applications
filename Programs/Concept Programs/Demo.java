
import java.lang.*; 

class Arithmatic
{
	public int no1;
	public int no2;
	
	Arithmatic()
	{
		this.no1=0;
		this.no2=0;
	}
	
	Arithmatic(int x,int y)
	{
		this.no1=x;
		this.no2=y;
	}
	
	public void fun()
	{
		System.out.println("Inside fun");
		
	}
	
}
class Demo
{
	 public static void main(String args[])
	 {
		 Arithmatic obj;       //obj Reference
		 obj=new Arithmatic();
		 obj.fun();
	 }
}
		 
