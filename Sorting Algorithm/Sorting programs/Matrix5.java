
// Program to sort columns by using selection sort

import java.lang.*;
import java.util.*;

class MatrixData
{
	public void SortCol(int arr[][])
	{
		int pass=0,j=0,i=0,temp=0,k=0;

	for(i=0;i<arr.length;i++)      // i is used for columns 
	{
        for(pass=0;pass<arr.length-1;pass++)
		{
			int IndexMin=pass;
			for(j=pass+1;j<arr.length;j++)      // j is used for rows       
			{
				if(arr[IndexMin][i]>arr[j][i])        
				{
					IndexMin=j;
				}
			}


			if(arr[pass][i]!=arr[IndexMin][i])
			{
			temp=arr[pass][i];
			arr[pass][i]=arr[IndexMin][i];
			arr[IndexMin][i]=temp;
		    }

		
		}
     }

 }

 }



class Matrix5
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

		MatrixData mobj=new MatrixData();
		mobj.SortCol(arr);

       System.out.println("Elements of matrix after sorting is : ");
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