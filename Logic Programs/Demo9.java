// Accept number from user and display that number of elements from the fibonaccai series
// input: 10

 /*       F S T
		    F S T
			  F S T
			    F S T
//output: 0 1 1 2 3 5 8 13 21 34

*/

import java.lang.*;
import java.util.*;

class Number
{
	void FibSeries(int iNo)
	{
		int First=0,Second=1,Third=0;
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		for(int i=1;i<=iNo;i++)
		{
			System.out.print(First+"\t");
			Third=First+Second;
			First=Second;
			Second=Third;
		}
		
	}
	
}

class Demo9
{
	public static void main(String arr[])
	{
		Number nobj=new Number();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number");
		int value=sobj.nextInt();
	     nobj.FibSeries(value);
		
	}
}
	
