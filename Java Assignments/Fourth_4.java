
/* Write a program which accept number from user and return summation of all its
non factors.
Input : 12
Output : 50
Input : 10
Output : 37 

*/

import java.lang.*;
import java.io.*;

class Demo
{
	public int SumNonFact(int iNo)
	{
		int iSum=0;
		for(int i=1;i<=iNo;i++)
		{
			if((iNo%i)!=0)
			{
				iSum=iSum+i;
			}
		}
		
		return iSum;
		
		
	}
		
}

class Fourth_4
{
	public static void main(String args[]) throws Exception
	{
		
	    InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		System.out.println("Enter the number");
		int no=Integer.parseInt(bobj.readLine());
		
		Demo dobj=new Demo();
		int iRes=dobj.SumNonFact(no);
		
		System.out.println("Summation of all it's non-factors are:"+iRes);
		
	}
}