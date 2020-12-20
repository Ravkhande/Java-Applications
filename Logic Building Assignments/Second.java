
/*
Write Java program which accept String from user and display
below pattern.

Input : Hello

Output : 
 H e l l o
 H e l l *
 H e l * *
 H e * * *
 H * * * * 

*/

import java.lang.*;
import java.util.*;

class Pattern
{
     public void pattern(String str)
    {
    	char arr[]=str.toCharArray();
    	int i,j,iCnt=0;


    	System.out.println();
    	for(i=0;i<arr.length;i++)
    	{
    		for(j=arr.length-1;j>=0;j--)
    		{

    			if(i<=j)
    			{

    				System.out.print(arr[iCnt]+"\t");
    				iCnt++;
    			}
    			else if(i>j)
    			{
    				System.out.print("*\t");

    			}

    		}
    		iCnt=0;
    		System.out.println();
         
       } 

    	}
}


class Second
{
	public static void main(String args[])
	{
		Pattern pobj=new Pattern();
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the string :");
		String str=sobj.nextLine();

        pobj.pattern(str);


	}
}