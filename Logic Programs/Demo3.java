
// WAP which calculate the Multiplication of even factorial of number
/* Input: 7
output:  2*4*6

Input: 8
output: 2*4*6*8
*/

import java.lang.*;
import java.util.*;

class Numbers
{
	int EvenFactorial(int iNo)
	{
	       int fact=1;
		   if(iNo<0)
		   {
			   iNo=-iNo;
		   }
		   
		   int iCnt=2;
		   while(iCnt<=iNo)
		   {
			   fact=fact*iCnt;
			   iCnt=iCnt+2;
		   }
		   return fact;
	}
}

class Demo3
{
	public static void main(String arr[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		Numbers nobj=new Numbers();
		int iRes=nobj.EvenFactorial(value);
		
		System.out.print("Even Factorial is:\t"+iRes);
		
	}
}
