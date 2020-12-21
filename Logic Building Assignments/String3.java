
/*
Write a program which 2 strings from user and check whether
first N contents of two strings are equal or not.
Note : If third parameter is greater than the size of second string
then concat whole string after first string.
Input : 
 Marvellous Infosystems
 Marvellous Logic Building
 10
Output : TRUE 

*/

import java.lang.*;
import java.util.*;


class StringDemo
{
  public boolean StrNCmpX(String src, String dest ,int iCnt)
 {
 	char Src[]=src.toCharArray();
 	char Dest[]=dest.toCharArray();
       
       int i=0,j=0;
 	while((i<Src.length) && (j<Dest.length) && (iCnt!=0))
 	{
 		if((Src[i]==Dest[j]))
 		{
 			i++;
 			j++;
 		}
 		else
 		{
 			break;
 		}
 		iCnt--;
 	}


 	if((i==Src.length && j==Dest.length) || (Src==Dest) || (iCnt==0))
 	{
 		return true;
 	}
 	else
 	{
 		return false;
 	}
 } 
}


class String3
{
public static void main(String arg[])
{
	boolean bRet=false;
	StringDemo dobj=new StringDemo();
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter the First string");
	String arr1=sobj.nextLine();
	
	System.out.println("Enter the second string");
	String arr2=sobj.nextLine();
	
	System.out.println("Enter the N value:");
	int value=sobj.nextInt();
	
      bRet=dobj.StrNCmpX(arr1,arr2,value);
      if(bRet==true)
      {
      	System.out.println("First N Contents of both the strings are equal");
      }
      else
      {
      	System.out.println("First N Contents of both the strings are not equal");
      }
	
}
}
	
