// Accept number from user and check whether that number is strong number or not.
// Strong number is such a number whose summation of factorral of digits is same as that number.
// Example : 145  1! + 4! + 5! = 145	true
// Example : 190  1! + 9! + 0! != 190	false
// Strong numbers are : 1	2	145		40585		.....

import java.lang.*;
import java.util.*;

class Digits
{
	boolean CheckStrong(int iNo)
	{
		int isum = 0;
		int idigit = 0;
		// 			 {0,1,2,3,4,  5,  6,  7,   8,     9}
		int fact[] = {1,1,2,6,24,120,720,5040,40320,362880};

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		int itemp = iNo;
		
		while(iNo != 0)	// loop to get the digits
		{
			idigit = iNo % 10;	// digit 
			iNo = iNo/10;	// remove the digit
			isum = isum + fact[idigit];	// add the factorial
			if(isum > itemp)	// to break the loop early
			{
				break;
			}
		}

		if(itemp == isum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Demo
{
	public static void main(String arg[])
	{
		boolean bret = false;
		Digits dobj = new Digits();
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number");
		int value = sobj.nextInt();
		bret = dobj.CheckStrong(value);
		if(bret == true)
		{
			System.out.println("Number is Strong");
		}
		else
		{
			System.out.println("Number is not strong");
		}
	}
}
