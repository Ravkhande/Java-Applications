
 
//Application used to add two numbers

import java.lang.*;
import java.util.*;

class Arithmetic    //server-Dukan
{
	int Add(int iNo1,int iNo2)
	{
		int iResult=iNo1+iNo2;
		return iResult;
	}
}


class Demo2     //client-ghar
{
	public static void main(String arr[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter first number");
		int iValue1=sobj.nextInt();
		
		System.out.println("Enter Second number");
		int iValue2=sobj.nextInt();
		
		Arithmetic aobj=new Arithmetic();
		int iRes=aobj.Add(iValue1,iValue2);
		
		System.out.println("Addition of two numbers are:\t"+iRes);
	}
}

		
		
