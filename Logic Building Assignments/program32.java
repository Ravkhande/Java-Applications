
/* 
Write Java program which accept String from user and display
below pattern.

Input : Hello

Output : 
  H e l l o
  H e l l
  H e l
  H e
  H 
 
*/

import java.lang.*;
import java.util.*;

class Pattern
{
 public void pattern(String str)
 {
	  char arr[]=str.toCharArray();
	  int i,j;
	  for(i=arr.length-1;i>=0;i--)
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


class Second
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
		
