
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
 H e l l
 H e l
 H e l
 H e
 H 
 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
 public void Pattern(String str)
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
	 
	 for(i=arr.length-1;i>=0;i--)
	 {
		 for(j=0;j<arr.length-1;j++)
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

class Fifth
{
	public static void main(String args[])
	{
		Matrix mobj=new Matrix();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the string :");
		String arr=sobj.nextLine();
		
		mobj.Pattern(arr);
		
	}
}

