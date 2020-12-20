
/* 
 Write a java program which accept string from user and count
number of small characters.

Input : Marvellous
Output : 9 

*/


import java.lang.*;
import java.util.*;

class StringDemo
{
 public int CountSmall(String str)
 {
	int iCnt=0;
	char arr[]=str.toCharArray();
	
	for(int i=0;i<arr.length;i++)
	{
		if((arr[i]>='a') && (arr[i]<='z'))
		{
			iCnt++;
		}
	}
	
	return iCnt;
 } 
}


class Second
{
public static void main(String arg[])
{
	StringDemo dobj=new StringDemo();
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter the string");
	String arr=sobj.nextLine();
	
	int iRes=dobj.CountSmall(arr);

   	System.out.println("count of number of small characters is:\t"+iRes);
	
}
}
	
