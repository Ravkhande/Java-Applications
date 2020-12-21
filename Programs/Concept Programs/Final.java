
import java.lang.*;

//////////////    final characteristics //////////////
/*
class Base
{
	final public int i;
	public int j=21;
	
	    public Base()
		{
			i=23;
		}
	
   
         public void fun()      
		{
          System.out.println("Base fun");
          //i++;    //NA
          System.out.println(this.j);
		}
}

////////// final Method /////////  

class Base
{
	   
         final public void fun()      
		{
		}
		
		public void gun(){}
		
}

class Derived extends Base
{
	public void fun(){}        //NA
	public void gun(){}        //Allowed
		
}
		

*/
//////////////      final class //////////////

final class Base
{
	   
        final public void fun()      
		{
		}
		
		public void gun(){}
		
}

class Derived extends Base       //NA
{
	
}



////////////////
class Final
{
     public static void main(String brr[])
	 {
		 System.out.println("Inside main");
		 
		 Base bobj=new Base();
		 Derived dobj=new Derived();
		 
		
		 		 
	 }
}
		