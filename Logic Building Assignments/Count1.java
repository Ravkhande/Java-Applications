
/* Write a program which accept number from user and return the
count of odd digits.

Input : 2395
Output : 3
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 0 
*/

import java.lang.*;
import java.util.*;

class Digit
{
 public int CountOdd(int iNo)
 {
     int iCnt=0;
	 if(iNo<0)       //updator
	 {
		 iNo=-iNo;
	 }
	 
	 while(iNo!=0)
	 {
		 if(((iNo%10)%2)!=0)
		 {
			 iCnt++;
		 }
		 iNo=iNo/10;
	 }
	 
	 return iCnt;
			 
 }
} 

class Count1
{
	public static void main(String args[])
	{
		Digit dobj=new Digit();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int value=sobj.nextInt();
		
		int iRes=dobj.CountOdd(value);
		System.out.println("count of odd digits is:\t"+iRes);
		
	}
}
