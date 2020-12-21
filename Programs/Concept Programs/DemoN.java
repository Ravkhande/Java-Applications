/*
// Accept N numbers from user.
//Accept one another number and return the nearest  umber to that number.

// Input : N = 10
// Element = 15
//	5	8	12	4	-8	8	10	2	2	0
// Output :	12	

// Input : N = 10
// Element = 2
//	5	8	12	4	-8	8	10	2	2	0
// Output :	2	

// Input : N = 10
// Element = 7
//	5	8	12	4	-8	8	10	2	2	0
// Output :	8

// Input : N = 10
// Element = 25
//	5	8	12	4	-8	8	10	2	2	0
// Output :	12	
*/

import java.lang.*;
import java.util.*;
class DemoArray
{
	int Nearest(int arr[], int iNo)
	{
	     int i=0;

		if(iNo>5)
		{
			int iMax=arr[i];
			for(i=1;i<arr.length+1;i++)
			{
				if(iMax<arr[i])
				{
					iMax=arr[i];
				}
			}
			
		    while(arr[i]<iMax && iMax>arr[i+1])
			{
				i++;
			}
			
			if(arr[i+1]<=iNo || arr[i+1]>=iNo)
			{
				return arr[i+1];
			}
		}
		else
		{
			int iMin=arr[i];
			for(i=1;i<arr.length+1;i++)
			{
				if(iMin>arr[i])
				{
					iMin=arr[i];
				}
			}
			
		    while(arr[i]>iMin && iMin<arr[i+1])
			{
				i++;
			}
			
			if(arr[i+1]<=iNo)
			{
				return arr[i+1];
			}
			
	}
	
	return 0;
	}
}

class DemoN
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int size = sobj.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}
		System.out.println("Enter the number");
		int value = sobj.nextInt();
		
		DemoArray dobj = new DemoArray();
		int ret = dobj.Nearest(arr,value);

		System.out.println("Nearest number is "+ret);
	}
}

