
/* Write a java program which accept number from user and return the
count of even digits.

Input : 2395
Output : 1
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 4 
*/

import java.lang.*;
import java.util.*;

class Digit
{
 public int CountEven(int iNo)
 {
     int iCnt=0;
	 if(iNo<0)       //updator
	 {
		 iNo=-iNo;
	 }
	 
	 while(iNo!=0)
	 {
		 if(((iNo%10)%2)==0)
		 {
			 iCnt++;
		 }
		 iNo=iNo/10;
	 }
	 
	 return iCnt;
			 
 }
} 

class Count
{
	public static void main(String args[])
	{
		Digit dobj=new Digit();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int value=sobj.nextInt();
		
		int iRes=dobj.CountEven(value);
		System.out.println("count of even digits is:\t"+iRes);
		
	}
}
