
 // sorting each row of matrix by using selection sort

// First Approach //

import java.lang.*;
import java.util.*;


class Display
{
	public void Sort(int Arr[])
	{
		
		for(int pass=0;pass<Arr.length-1;pass++)
		{
			int IndexMin=pass;

            
			for(int j=pass+1;j<Arr.length;j++)         // it is used to find the smallest number
			{
				if(Arr[IndexMin]<Arr[j])         // for decresing order element is swap
				{
					IndexMin=j;
				}
			}

			/*

			for(int j=pass+1;j<Arr.length;j++)         // it is used to find the smallest number
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

class MatrixData extends Display
{
	public void RowSort(int Arr[][])
	{
		for(int i=0;i<Arr.length;i++)
		{
              Sort(Arr[i]);

			}

			
		}
		
}

class Matrix
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		MatrixData mobj=new MatrixData();
	
		System.out.println("Enter the number of rows :");
		int row=sobj.nextInt();

        System.out.println("Enter the number of columns :");
		int col=sobj.nextInt();

		int arr[][]=new int[row][col];

		System.out.println("Enter the elements of array :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
					
			arr[i][j]=sobj.nextInt();
		}
		}

        System.out.println("Enterred elements are :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
					
			  System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
		}

       mobj.RowSort(arr);

		System.out.println("Elements of matrix after Sorting :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
					
			  System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
		}

	}
}

