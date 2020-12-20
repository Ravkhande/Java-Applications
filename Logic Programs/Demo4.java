
/* Accept number from  user and check whether that number is strong number or not */

//strong number is such a number whose summation of factorial of digits is equal to original number 
//Example: 145 (1!+4!+5!)=145 ->True
//Example: 190  (1!+9!+0!)!=190 ->false

import java.lang.*;
import java.util.*;

class Digits
{
	boolean CheckStrong(int iNo)
	{
		int iFact=1;
		int iSum=0;
		int itemp=iNo;
		/*
		while(iNo!=0)     //Method 1
		{
			int iDigit=iNo%10;
			for(int i=iDigit;i>=1;i--)
			{
				iFact=iFact*i;
			}
			iSum=iSum+iFact;
			iNo=iNo/10;
			iFact=1;
		}
		
		*/
		
		while(iNo!=0)      //Method 2
		{
			int iDigit=iNo%10;   //digits
			while(iDigit!=0)      //factorial of digit
			{
				iFact=iFact*iDigit;
				iDigit--;
			}
			iSum=iSum+iFact;
			iNo=iNo/10;
			if(iSum>itemp)        //to break the loop early
			{
				break;
			}
			iFact=1;     // to reset the variable
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

class Demo4
{
	public static void main(String arr[])
	{
		boolean bret=false;
		Digits dobj=new Digits();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number");
		int value=sobj.nextInt();
		bret=dobj.CheckStrong(value);
		if(bret==true)
		{
			System.out.println("Number is Strong");
		}
		else
		{
			System.out.println("Number is not a Strong number");
		}
	}
}
	