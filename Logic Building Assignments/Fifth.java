

/*
Write a java program which accept string from user and display
it in reverse order.

Input : MarvellouS
Output: SuollevraM
*/

import java.lang.*;
import java.util.*;

class StringDemo
{
 public void Reverse(String str)
 {
	 int iStart=0,iEnd=0;
	 char temp='\0';
	 
	 char arr[]=str.toCharArray();
	
	 while(iEnd!=arr.length)
	 {
		 iEnd++;
	 }
	 
	 iEnd--;
	 while(iStart<=iEnd)
	 {
		 temp=arr[iStart];
		 arr[iStart]=arr[iEnd];
		 arr[iEnd]=temp;
		 
		 iStart++;
		 iEnd--;
	 }
	 
	  System.out.println("Reversed String is :");
	 for(int i=0;i<arr.length;i++)
	 {
		
	   System.out.print(arr[i]);
	 }
	 
	
	}
	
 } 

class Fifth
{
public static void main(String arg[])
{
		
	StringDemo dobj=new StringDemo();
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter the string");
	String arr=sobj.nextLine();
	
	dobj.Reverse(arr);
		
}
}