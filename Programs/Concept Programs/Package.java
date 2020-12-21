
import java.lang.*;
import Marvellous.Hello;                  // Normal package -> by using this we import hello.class file into jvm memory
import Marvellous.Batch.Maths.Operator.Pack;    //nested package


class Package
{
	
	public static void main(String brr[])
	{
		System.out.println("Inside main");
		
		Hello hobj=new Hello();
		hobj.fun();
		
		Pack pobj=new Pack();
		pobj.gun();
	}
}
