
import java.lang.*;

interface RBI
{
      int Amount=100000;      //public, static ,final
	  
	  double LoanInterest();   
	  double FDInterest(); 
	                   //abstract method
					   
    /*  public RBI()
	 {
		 System.out.println("Inside constructor");
	 }
	 */
					   
}

interface CBI
{
      int Amount=100000;      //public, static ,final
	  
	  double LoanInterest();   
	  double FDInterest(); 
	                   //abstract method
					   
    /*  public RBI()
	 {
		 System.out.println("Inside constructor");
	 }
	 */
					   
}
class SBI implements RBI,CBI
{
	public double LoanInterest()         //concrete method
	{
		return 5.2;
	} 
	
	public double FDInterest()
	{
		return 4.2;
	}
}


class BOI implements RBI
{
	public double LoanInterest()         //concrete method
	{
		return 6.2;
	} 
	
	public double FDInterest()
	{
		return 5.2;
	}
}

class Inter
{
	public static void main(String crr[])
	{
		System.out.println("Inside main");
       RBI robj;  //A
     //RBI robj=new RBI();  
    
	  
	  SBI sobj=new SBI();
	  BOI bobj=new BOI();
	  
	  System.out.println("sobj.FDInterest()");
	  
	  System.out.println("bobj.FDInterest()");
	
	  
	  System.out.println("sobj.Amount");    //because of public we can access
	 //sobj.Amount++;    //NA
	  
	  System.out.println("RBI.Amount");    //because of static we can access  
	}
}
	
	