
/* Program to divide two numbers  */

import java.lang.*;
import java.util.*;

class Demo
{
	public int Divide(int iNo1,int iNo2)
	{
		if(iNo2>iNo1)
		{
			System.out.println("Unnable to perform the Division");
		}
		
		return(iNo1/iNo2);
	}
		
		
}

class First_1
{
	public static void main(String args[])
	{
		Demo dobj=new Demo();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter first number");
		int no1=sobj.nextInt();
		
		System.out.println("Enter Second number");
		int no2=sobj.nextInt();
		
		int iRes=dobj.Divide(no1,no2);
		System.out.println("Division of two numbers is\t" + iRes);
		
			
		
		
	}
}
		
		
		
		
		
		
		
		