
/* Write a program which accept number from user and print that number of $ & *
on screen.
Input : 5
Output : $ * $ * $ * $ * $ *
Input : 3
Output : $ * $ * $ *
Input : -3
Output : $ * $ * $ * 
*/

import java.lang.*;
import java.util.*;

class Demo    //server-Dukan
{
	void Pattern(int iNo)
	{
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		for(int i=1;i<=iNo;i++)
		{
			System.out.print("$\t*\t");
		}
	}
}


class First_9     //client-ghar
{
	public static void main(String arr[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		Demo dobj=new Demo();
		dobj.Pattern(iValue);
		
	}
}

		
		
