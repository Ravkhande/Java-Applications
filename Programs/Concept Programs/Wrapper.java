
import java.lang.*;

class Wrapper
{
	public static void main(String arr[])
	{
		int i=11;
		Integer iobj=i;      //Autoboxing   //primitive to wrapper class
		
		System.out.println(i);
		System.out.println(iobj);
		
		int j=iobj;       //Autounboxing    //wrapper class to primitive datatype
		
		System.out.println(j);

	}
}


