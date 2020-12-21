/* // Accept number from user and check whether that number is armstrong number or not
// Input : 153	
// Output : true	(1^3 + 5^3 + 3^3) = 153	-> 3 is the number of digits

// Input : 2145
// Output : false	(2^4 + 1^4 + 4^4 + 5^4) != 2145

*/

import java.lang.*;
import java.util.*;

class Demo
{
	int CountDigit(int iNo)
	{
		int iCnt=0;
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		while(iNo!=0)
		{
			iCnt++;
			iNo=iNo/10;
		}
		
		return iCnt;
	}
	
	boolean Check(int iNo)
	{
		int itemp=iNo;
		int iDigit=0,iSum=0,iMul=1;
		int power=CountDigit(iNo);
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			for(int i=1;i<=power;i++)
			{
				iMul=iMul*iDigit;
			}
			iSum=iSum+iMul;
			iNo=iNo/10;
			iMul=1;
		}
		
		if(itemp==iSum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	
}

class Armstrong
{
	public static void main(String args[])
	{
		boolean bRet=false;
		Demo dobj=new Demo();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int value=sobj.nextInt();
		
		bRet=dobj.Check(value);
		if(bRet==true)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong number");
		}
	}
}

		