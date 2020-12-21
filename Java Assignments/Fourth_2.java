

/* Accept number from user and check whether number is even or
odd. */

import java.lang.*;
import java.util.*;

class Demo
{
	
	public int Display(int iNo)
	{
		if((iNo%2)==0)
		{
			return 1;      //for TRUE
		}
		else
		{
			return 0;     //for FALSE
		}
			
	}
	
}

class Fourth_2
{
	public static void main(String arg[])
	{
		Demo dobj=new Demo();
		Scanner sobj=new Scanner (System.in);
		
		System.out.println("Enter the number");
		int no=sobj.nextInt();
		
		
	    int iRes=dobj.Display(no);
		if(iRes==1)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
	}
}
