
/* Write a program which accept number from user and return difference between
summation of all its factors and non factors. */

import java.lang.*;
import java.io.*;

class Demo
{
	public int DiffFact(int iNo)
	{
		if(iNo<0)
		{
			iNo=-iNo;
		}
		int iSum1=0;
		int iSum2=0;
		for(int i=1;i<=iNo/2;i++)
		{
			if((iNo%i)==0)
			{
				iSum1=iSum1+i;
			}
		}
		for(int i=1;i<=iNo;i++)
		{
			if((iNo%i)!=0)
			{
				iSum2=iSum2+i;
			}
			
		}
		
		return(iSum1-iSum2);
		
	}
		
}

class Fifth_4
{
	public static void main(String args[]) throws Exception
	{
		
	    InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		System.out.println("Enter the number");
		int no=Integer.parseInt(bobj.readLine());
		
		Demo dobj=new Demo();
		int iRes=dobj.DiffFact(no);
		
		System.out.println("Difference is :"+iRes);
		
	}
}