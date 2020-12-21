

/* 
Write a java program which accept string from user and return
difference between frequency of small characters and frequency
of capital characters.

Input : MarvellouS
Output : 6 (8-2) 
*/

import java.lang.*;
import java.util.*;

class StringDemo
{
 public int CountSmall(String str)
 {
	int capcount=0,smcount=0;
	char arr[]=str.toCharArray();
	
	for(int i=0;i<arr.length;i++)
	{
		if((arr[i]>='A') && (arr[i]<='Z'))
		{
			capcount++;
		}
		else if((arr[i]>='a') && (arr[i]<='z'))
		{
			smcount++;
		}
	}
	
	
	return(smcount-capcount);
 } 
}


class Count6
{
public static void main(String arg[])
{
	StringDemo dobj=new StringDemo();
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter the string");
	String arr=sobj.nextLine();
	
	int iRes=dobj.CountSmall(arr);

   	System.out.println("Difference between frequency of small characters and frequency of capital characters is :  " +iRes);
	
}
}
	
