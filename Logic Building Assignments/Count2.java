
/* Write a program which accept number from user and return the
count of digits in between 3 and 7.

Input : 2395
Output : 1
Input : 1018
Output : 0
Input : 4521
Output : 2
Input : 9922
Output : 0 
*/

import java.lang.*;
import java.util.*;

class Digit
{
 public int CountRange(int iNo)
 {
     int iCnt=0;
	 if(iNo<0)       //updator
	 {
		 iNo=-iNo;
	 }
	 
	 while(iNo!=0)
	 {
		 if(((iNo%10)>3) && ((iNo%10)<7))
		 {
			 iCnt++;
		 }
		 iNo=iNo/10;
	 }
	 
	 return iCnt;
			 
 }
} 

class Count2
{
	public static void main(String args[])
	{
		Digit dobj=new Digit();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int value=sobj.nextInt();
		
		int iRes=dobj.CountRange(value);
		System.out.println("count of digits in between 3 and 7 is:\t"+iRes);
		
	}
}
