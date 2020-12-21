
// Selection sort implementation in java 

/*
Worst case time complexity : O(N^2);
Average case time complexity : O(N^2);
Best case time complexity : O(N);
space complexity : O(1)

*/

//0 1 2 3 4
//2 8 4 5 7

import java.lang.*;
import java.util.*;

class Display
{
	public void Sort(int Arr[])
	{
		
		for(int pass=0;pass<Arr.length-1;pass++)
		{
			int IndexMin=pass;

			for(int j=pass+1;j<Arr.length;j++)         
			{
				if(Arr[IndexMin]<Arr[j])         // for decreasing order element is swap
				{
					IndexMin=j;
				}
			}

			/*

			for(int j=pass+1;j<Arr.length;j++)         
			{
				if(Arr[IndexMin]>Arr[j])         // for incresing element
				{
					IndexMin=j;
				}
			}
              
               */

			if(Arr[pass]!=Arr[IndexMin])
			{
			int temp=Arr[pass];
			Arr[pass]=Arr[IndexMin];
			Arr[IndexMin]=temp;
		}

		
		}

	}

}

class Selectionsort
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		Display dobj=new Display();
		System.out.println("Enter the size of array:");
		int size=sobj.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the elements of array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sobj.nextInt();
		}

		System.out.println("Elements of array before Sorting :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}

		System.out.println();
     
		dobj.Sort(arr);

		System.out.println("Elements of array after Sorting :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}

	}
}

