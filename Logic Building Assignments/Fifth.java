
/* Write a program which accept number from user and return
difference between summation of even digits and summation of odd
digits.

Input : 2395
Output : -15 (2 - 17)
Input : 1018
Output : 6 (8 - 2)
Input : 8440
Output : 16 (16 - 0)
Input : 5733
Output : -18 (0 - 18) 
*/

import java.lang.*;
import java.util.*;

class Digit
{
 public int CountDiff(int iNo)
 {
	 int iEvenSum=0,iOddSum=0;
	 
	 if(iNo<0)       //updator
	 {
		 iNo=-iNo;
	 }
	 
	 while(iNo!=0)
	 {
		if(((iNo%10)%2)==0)
		{
			iEvenSum=iEvenSum+(iNo%10);
		}
		else
		{
			iOddSum=iOddSum+(iNo%10);
		}
		 iNo=iNo/10;
	 }
	 
	 return(iEvenSum-iOddSum);		 
 }
} 

class Fifth
{
	public static void main(String args[])
	{
		Digit dobj=new Digit();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int value=sobj.nextInt();
		
		int iRes=dobj.CountDiff(value);
		System.out.println("Difference between summation of even digits and summation of odd digits is:\t"+iRes);
		
	}
}

