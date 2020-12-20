
/* 
Write Java program which accept String from user and display
below pattern.

Input : Hello

Output : 
 H
 H e
 H e l
 H e l l
 H e l l o 
 
 
*/

import java.lang.*;
import java.util.*;

class Pattern
{
 public void pattern(String str)
 {
	  char arr[]=str.toCharArray();
	  int i,j;
	 
	  for(i=0;i<arr.length;i++)
	  {
		  for(j=0;j<arr.length;j++)
		  {
			  if(i>=j)
			  {
				  System.out.print(arr[j]+"\t");
			  }
		  }
		  System.out.println();
	  }

	 
	 }	 
 }
}


class Third
{
	public static void main(String args[])
	{
		Pattern pobj=new Pattern();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String Str=sobj.nextLine();
		
		pobj.pattern(Str);
		
	}
}
		