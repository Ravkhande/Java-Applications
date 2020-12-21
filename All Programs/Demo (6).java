// Accept number from user and check whether that number is armstrong number or not
// Input : 153	
// Output : true	(1^3 + 5^3 + 3^3) = 153	-> 3 is the number of digits

// Input : 2145
// Output : false	(2^4 + 1^4 + 4^4 + 5^4) != 2145

import java.lang.*;
import java.util.*;

class Numbers
{
	int CountDigit(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		int iCnt = 0;
		while(iNo != 0)
		{
			iCnt++;
			iNo = iNo / 10;
		}
		return iCnt;
	}
	boolean CheckArmstrong(int iNo)	// 153
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		int power = CountDigit(iNo);	// 3
		int temp = iNo;		// 153
		int iDigit = 0, Mult = 1, iSum = 0;
		while(iNo != 0)	//	153		15		1		0
		{
			iDigit = iNo % 10;	// 3		5		1
			Mult = 1;
			for(int i = 1; i<= power;i++)
			{
				Mult = Mult * iDigit;
			}

			iSum = iSum + Mult;
			if(iSum > temp)
			{
				break;
			}
			iNo = iNo / 10;
		}

		if(iSum == temp)
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
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number");
		int ivalue = sobj.nextInt();

		Numbers nobj = new Numbers();
		boolean bret = nobj.CheckArmstrong(ivalue);

		if(bret == true)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}
}

