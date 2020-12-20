
import java.lang.*;

abstract class RBI
{
	public int IFSC=51;
	
	public RBI()
	{
		System.out.println("constructor of RBI");
									
	}
	
	public void Details()
	{
		System.out.println("Details of Bank");
	}
	
	//virtual void Interest()=0;    -> pure virtual function in C++
	abstract public void Interest();      //abstract method
	
}

class PNB extends RBI
{
	public void Interest()         //concrete method
	{
		System.out.println("Interest rate is 5.5%");
	} 
	
	public void FD()
	{
		System.out.println("FD of PNB");
	}
}

class Abstract
{
	public static void main(String crr[])
	{
		System.out.println("Inside main");
     RBI robj;  //A
      PNB obj=new PNB();

     // RBI robj=new RBI();  //NA

       obj.Details();
         obj.Interest();
           obj.FD();
	}
}
	
	
		
	