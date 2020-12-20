
/* Write a Java program which accept string from user and count
number of capital characters.

Input : Marvellous Multi OS
Output : 4
*/

import java.lang.*;
import java.util.*;

class StringDemo
{
 public int CountCapital(String str)
 {
	 int iCnt=0;
	 char arr[]=str.toCharArray();
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>='A' && arr[i]<='Z')
		 {
			 iCnt++;
		 }
	 }
	 
       return iCnt;	
 } 
}


class First
{
public static void main(String arg[])
{
	StringDemo dobj=new StringDemo();
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter the string");
	String arr=sobj.nextLine();
	
	int iRes=dobj.CountCapital(arr);

   	System.out.println("count of number of capital characters is:\t"+iRes);
	
}
}
	