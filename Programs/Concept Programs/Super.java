
import java.lang.*;

class Base
{
	public int i=11;
	public int j=21;
	
	public Base(int k)   //k=11
	{
		System.out.println("Parametrised constructor");
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
			 super(11);//it is used to call the base class constructor excplictly inside the derived constructor
		System.out.println("Derived constructor");
	}
	
	public void gun()
	{
		System.out.println("Derived fun");
		System.out.println(this.x);       
System.out.println(super.i);    //it is used to access the non private Characteristics of base class 
System.out.println(super.j);       ////it is used to access the non private Characteristics of base class 
super.fun();   //it is used to access the non private methods of base class 
	}
	
	
}
	
		
class Super
{
     public static void main(String brr[])
	 {
		 System.out.println("Inside main");
		 
		 Derived dobj=new Derived();
		 
		// bobj.fun();   //Base fun
		 dobj.gun();    //Derived fun
		 
		 		 
	 }
}