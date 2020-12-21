
//Insertion sort in java

import java.lang.*;
import java.util.*;

class Insertion
{
	public void Sort(int arr[])
	{
		int pass=0,key=0,j=0;

		for(pass=1;pass<arr.length;pass++)
		{
			key=arr[pass];
			j=pass-1;

			while((j>=0) && (arr[j]>key))
			{
                     arr[j+1]=arr[j];
                     j--;
			}
			arr[j+1]=key;
		}

	}

}

class InsertionsortN
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sobj.nextInt();
		int arr[]=new int[size];

		System.out.println("Enter the elements of Array : ");
		for(int i=0;i<arr.length;i++)
		{
		
				arr[i]=sobj.nextInt();
			
		}

		System.out.println("Entered elements of Array are : ");
		for(int i=0;i<arr.length;i++)
		{
				System.out.print(arr[i]+"\t");
		
		}


		Insertion iobj=new Insertion();
		iobj.Sort(arr);

		System.out.println("\nElements of Array after complete sorting is : ");
		for(int i=0;i<arr.length;i++)
		{
				System.out.print(arr[i]+"\t");
			
		}

	}
}