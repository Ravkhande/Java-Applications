// Accept number from user and check whether that number is Armstrong or not

///153 -> 1^3+5^3+3^3 =153  -> 3 is the number of digits
// 2145 -> is 

import java.lang.*;
import java.util.*;

class Number
{
	int CountDigits(int iNo)
	{
		int power=0;     // to count the digits
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		while(iNo!=0)
		{
			power++;
			iNo=iNo/10;
			
		}
		
		return power;
	}
	
		
	boolean CheckArmstrong(int iNo)
	{
		int iDigit=0,iSum=0,Mul=1;
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		
		int power=CountDigits(iNo); 
		int itemp=iNo;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			Mul=1;
		    for(int i=1;i<=power;i++)
			{
				Mul=Mul*iDigit;
			}
			iSum=iSum+Mul;
			if(iSum>itemp)
			{
				break;
			}
			iNo=iNo/10;
		}
		
		if(iSum==itemp)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}

class Demo8
{
	public static void main(String arr[])
	{
		boolean bret=false;
		Number nobj=new Number();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number");
		int value=sobj.nextInt();
		bret=nobj.CheckArmstrong(value);
		if(bret==true)
		{
			System.out.println("Number is Armstrong number");
		}
		else
		{
			System.out.println("Number is not Armstrong number");
		}
	}
}
	