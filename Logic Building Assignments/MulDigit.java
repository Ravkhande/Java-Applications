
/* Write a program which accept number from user and return
multiplication of all digits.

Input : 2395
Output : 270
Input : 1018
Output : 8
Input : 9440
Output : 144
Input : 922432
Output : 864 
*/

import java.lang.*;
import java.util.*;

class Digit
{
 public int Multiply(int iNo)
 {
	 int iDigit=0;
     int iMul=1;
	 if(iNo<0)       //updator
	 {
		 iNo=-iNo;
	 }
	 
	 while(iNo!=0)
	 {
		iDigit=iNo%10;
		if(iDigit==0)
		{
			iDigit=1;
		}	 
		iMul=iMul*iDigit;
		 iNo=iNo/10;
	 }
	 
	 return iMul;		 
 }
} 

class MulDigit
{
	public static void main(String args[])
	{
		Digit dobj=new Digit();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int value=sobj.nextInt();
		
		int iRes=dobj.Multiply(value);
		System.out.println("Multiplication of all digits is:\t"+iRes);
		
	}
}
