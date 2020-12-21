
import java.lang.*;

class Base
{
	public int i=11;
	public int j=21;
	
	public Base(int k)
	{
		System.out.println("Base constructor");
	}
	
	public Base()
	{
		System.out.println("Base constructor");
	}
   
   /* virtual*/ public void fun()       //internally there is a concept of virtual in java
		{
          System.out.println("Base fun");
          System.out.println(this.i);
          System.out.println(this.j);
		}
}

class Derived extends Base
{
	public int x=32;
	
	public Derived()
	{
		System.out.println("Derived constructor");
	}
	
	public void fun()
	{
		System.out.println("Derived fun");
		super.fun();     //it is used to access the non private methods of base class 
		System.out.println(this.x);       
System.out.println(super.i);    //it is used to access the non private Characteristics of base class 
System.out.println(super.j);       ////it is used to access the non private Characteristics of base class 
	}
	
	public void gun()
		{
          System.out.println("Derived gun");
		}
}
	
		
class Method
{
     public static void main(String brr[])
	 {
		 System.out.println("Inside main");
		 
		 Base bobj=new Base();
		 Derived dobj=new Derived();
		 
		 bobj.fun();   //Base fun
		 dobj.fun();    //Derived fun
		 
		 Base bref=new Derived();         //upcasting in java
		 bref.fun();          //Derived fun
		 
	 }
}