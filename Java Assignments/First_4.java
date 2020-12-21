
/* Write a program which accept number from user and display its multiplication of
factors.

Input : 12
Output : 144 (1 * 2 * 3 * 4 * 6)
Input : 13
Output : 1 (1)
Input : 10
Output : 10 (1 * 2 * 5) 
*/

import java.lang.*;
import java.io.*;

class Demo
{
	public void MulFact(int iNo)
	{
		int fact=1;
		for(int i=1;i<=iNo/2;i++)
		{
			if((iNo%i)==0)
			{
			fact=fact*i;
			}
		}
		
		System.out.println("Multiplication of factors are:\t" + fact);
	}
		
}

class First_4
{
	public static void main(String args[]) throws Exception
	{
		
	    InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		System.out.println("Enter the number");
		int no=Integer.parseInt(bobj.readLine());
		
		Demo dobj=new Demo();
		dobj.MulFact(no);
		
	}
}
		
		
		
		