
/* Write a program which accept one number from user and print that number of
even numbers on screen. */

import java.lang.*;
import java.util.*;

class Demo
{
	public void Display(int iNo)
	{
		if(iNo<0)
		{
			iNo=-iNo;
		}
		for(int i=1;i<=iNo*2;i++)
		{
			if((i%2)==0)
			{
				System.out.println(i);
			}
		}
	}
		
}

class First_3
{
	public static void main(String args[])
	{
		Demo dobj=new Demo();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no=sobj.nextInt();
		
		dobj.Display(no);
	}
}
		
		
		
		