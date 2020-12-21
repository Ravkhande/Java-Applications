
/* Write Java program which accept String from user and display
below pattern.

Input : Hello
Output : 

      H * * * *
      H e * * *
      H e l * *
      H e l l *

 */ 

import java.lang.*;
import java.util.*;

class Pattern
{
     public void pattern(String str)
    {
    	char arr[]=str.toCharArray();
    	int i,j;


    	System.out.println();
    	for(i=0;i<arr.length-1;i++)
    	{
    		for(j=0;j<arr.length;j++)
    		{
    			if(j<=i)
    			{
    				System.out.print(arr[j]+"\t");
    			}
    			else if(j>i)
    			{
    				System.out.print("*\t");

    			}

    		}
    		System.out.println();
         
       } 

    	}
}


class Displaystr
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
