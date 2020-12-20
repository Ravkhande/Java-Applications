
/* 
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
		
		while(iNo!=0)      //Method 2
		{
			int iDigit=iNo%10;   //digits
			iNo=iNo/10;
			iSum=iSum+fact[iDigit];     // iSum=iSum+fact[iNo%10];
			if(iSum>itemp)        //to break the loop early
			{
				break;
			}
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
	