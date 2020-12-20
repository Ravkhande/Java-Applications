//

//strong number is such a number whose summation of factorial of digits is equal to original number 
//Example: 145 (1!+4!+5!)=145 ->True
//Example: 190  (1!+9!+0!)!=190 ->false

import java.lang.*;
import java.util.*;

class Digits
{
	void CheckStrongRange(int iStart,int iEnd)
	{
		int iSum=0;
		int itemp=iNo;
		         //{0,1,2,3, 4, 5,   6,   7,   8,    9}
		int fact[]={1,1,2,6,24,120,720,5040,40320,362880};
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
		
		if(iStart>iEnd)    //istart=10, iEnd=1000
		{
			return;
		}
		
		if(iStart<=0 || iEnd<=0)        //filters for -ve number
		{
			return;
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

class Demo5
{
	public static void main(String arr[])
	{
		Digits dobj=new Digits();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter starting range");
		int value1=sobj.nextInt();
		System.out.println("Enter Ending range");
		int value1=sobj.nextInt();
		dobj.CheckStrongRange(value1,value2);
		
	}
}
	