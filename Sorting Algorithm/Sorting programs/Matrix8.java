

// Program to sort Diagonal elements of matrix in increasing and decreasing order

import java.lang.*;
import java.util.*;

class MatrixData
{
	public void SortDiagonal(int arr[][],int ch)
	{
		int pass=0,j=0,temp=0;
		for(pass=0;pass<arr.length;pass++)
		{
			for(j=0;j<arr.length-1;j++)
			{
				if(pass==j)
				{
					switch(ch)
					{
						case 1:
					if(arr[pass][j]>arr[pass+1][j+1])        // to sort in increasing order
					{
						temp=arr[pass][j];
						arr[pass][j]=arr[pass+1][j+1];
						arr[pass+1][j+1]=temp;
					}
					
					break;
					case 2:
					if(arr[pass][j]<arr[pass+1][j+1])      // to sort in decreasing order
					{
						temp=arr[pass+1][j+1];
						arr[pass+1][j+1]=arr[pass][j];
						arr[pass][j]=temp;
					}
					break;
				}

				}

			}

		 }
	}
}



  
class Matrix8
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row=sobj.nextInt();

		System.out.println("Enter the number of columns : ");
		int col=sobj.nextInt();

		int arr[][]=new int[row][col];

		System.out.println("Enter the elements of matrix : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}

		System.out.println("Entered elements of matrix are : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("Enter in which order you required sorting : ");
		System.out.println("_____________________________________________");
		System.out.println("1 : Increasing order");
		System.out.println("2 : Decreasing order");
		System.out.println("______________________________________________");
		int choice=sobj.nextInt();

		MatrixData mobj=new MatrixData();
		mobj.SortDiagonal(arr,choice);

       System.out.println("\nElements of matrix after sorting Diagonal elements is : ");
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