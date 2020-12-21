

/* Accept one number from user and print that number of * on screen.  */

import java.lang.*;
import java.util.*;

class Demo
{
	public void Display(int iNo)
	{
		for(int i=0;i<iNo;i++)
		{
			System.out.print("*\t");
		}
	}
	
}

class First_2
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no=sobj.nextInt();
		
		Demo dobj=new Demo();
		
	     dobj.Display(no);
	}
}

		
		
		
		
		
		
