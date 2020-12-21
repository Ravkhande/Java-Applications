
////  by using nonbuffered way //////

import java.lang.*;
import java.util.*;

class Input1
{
	public static void main(String brr[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=sobj.nextLine();
		
		System.out.println("Enter the Age");
		int Age=sobj.nextInt();
		
		System.out.println("Enter the Percentage");
		float per=sobj.nextFloat();
		
		System.out.println("The name is" +name);
		System.out.println("The Age is" +Age);
		System.out.println("The percentage is" +per);
		
	}
}
		
		