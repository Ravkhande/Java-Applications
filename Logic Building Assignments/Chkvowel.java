
/*
Write a java program which accept string from user and check
whether it contains vowels in it or not.

Input : marvellous
Output : TRUE

Input : Demo
Output : TRUE

Input : xyz
Output : FALSE 
*/

import java.lang.*;
import java.util.*;

class StringDemo
{
 public boolean ChkVowel(String str)
 {
	 char arr[]=str.toCharArray();
	 
	 int i;
	 for(i=0;i<arr.length-1;i++)
	 {
		 if((arr[i]=='A') || (arr[i]=='a') || (arr[i]=='E') || (arr[i]=='e') || (arr[i]=='I') || (arr[i]=='i') || (arr[i]=='O') || (arr[i]=='o') || (arr[i]=='U') || (arr[i]=='u'))
		 {
			 break;
		 }
	 }
	 
	 if((arr[i]=='A') || (arr[i]=='a') || (arr[i]=='E') || (arr[i]=='e') || (arr[i]=='I') || (arr[i]=='i') || (arr[i]=='O') || (arr[i]=='o') || (arr[i]=='U') || (arr[i]=='u'))
     {
	      return true;
	  }
	  else
	  {
		  return false;
	  }
	
	}
	
	
 } 

class Chkvowel
{
public static void main(String arg[])
{
	boolean bRet=false;
	
	StringDemo dobj=new StringDemo();
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter the string");
	String arr=sobj.nextLine();
	
	bRet=dobj.ChkVowel(arr);
	if(bRet==true)
	{
		System.out.println("String contains vowels in it");
	}
	else
	{
		System.out.println("String not contains vowels in it");
	}
	
}
}
	
