
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

import java.lang.*;
import java.util.*;
class DemoArray
{
	void Nearest(int arr[], int iNo)
	{
		int iDiff=(iNo-arr[0]);
		int iMin=0,iCnt=0;

             iMin=iDiff;

          
             while(iMin>(iNo-arr[i]))
             {
             	iMin=(iNo-arr[i]);
             	i++;
             }     
           

		  System.out.println(iNo-iMin);

	}
}

class Near
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
		dobj.Nearest(arr,value);
	}
}

