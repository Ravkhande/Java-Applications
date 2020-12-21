
/* Write a program which accept number from user and return difference between
summation of even digits and summation of odd digits.
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

class Demo
{
	public static int iEvenSum;
	public static int iOddSum;
	
	static
	{
		iEvenSum=0;
		iOddSum=0;
	}
	public int CountDiff(int iNo)
	{
		int iDigit=0;
		if(iNo<0)
		{
			iNo=-iNo;
		}
		if(iNo!=0)
		{
			iDigit=iNo%10;
			if((iDigit%2)==0)
			{
				iEvenSum=iEvenSum+iDigit;
			}
			else
			{
				iOddSum=iOddSum+iDigit;
			}
			iNo=iNo/10;
		   CountDiff(iNo);
		}
		
		return(iEvenSum-iOddSum);
	}
		
}

class Fifth_7
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no=sobj.nextInt();
		
		Demo dobj=new Demo();
		
		int iRes=dobj.CountDiff(no);
		System.out.println("difference between summation of even digits and summation of odd digits is\t"+iRes);
	}
}
		
		
		