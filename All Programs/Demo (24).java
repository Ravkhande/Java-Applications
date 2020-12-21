import java.lang.*;
import java.util.*;

class Selection
{
	// 0	1	2	3	4
	// 2	8	4	5	7

	// 56		34		90		23		11

	public void Sort(int arr[])
	{
		int pass = 0, j = 0, temp= 0, min_i = 0;

		for(pass = 0; pass < arr.length-1; pass++)
		{
			min_i = pass;

			for(j = pass+1; j < arr.length; j++)
			{
				if(arr[min_i] > arr[j])
				{
					min_i = j;
				}
			}
			if(arr[pass] != arr[min_i])
			{
				temp = arr[pass];
				arr[pass] = arr[min_i];
				arr[min_i] = temp;
			}
		}	
	}
}

// Question : 
//Accept matrix and sort each row of matrix.

class Matrix
{
	public void RowSort(int arr[][])
	{
		int i = 0, j = 0, temp = 0, min_i = 0,pass = 0;
		
		for(i = 0; i <arr.length; i++)
		{
			for(pass = 0; pass < arr[i].length-1; pass++)
			{
				min_i = pass;

				for(j = pass + 1; j < arr[i].length; j++)
				{
					if(arr[i][min_i] > arr[i][j])
					{
						min_i = j;
					}
				}
				// swap
				if(arr[i][pass] != arr[i][min_i])
				{
					temp = arr[i][pass];
					arr[i][pass] = arr[i][min_i];
					arr[i][min_i] = temp;
				}
			}
		}
	}

	public void ColSort(int Arr[][])
	{
		// Logic
	}
}

class Demo
{
	public static void main(String arg[]) throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sobj.nextInt();

		System.out.println("Enter the number of column");
		int col = sobj.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter the values");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j =0; j< arr[i].length; j++)
			{
				arr[i][j] = sobj.nextInt();	
			}		
		}

		System.out.println("Enterred data is : ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j =0; j< arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");	
			}		
			System.out.println();
		}

		Matrix mobj = new Matrix();
		mobj.RowSort(arr);

		System.out.println("Matrix after complete sorting : ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j =0; j< arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");	
			}		
			System.out.println();
		}
		System.out.println();
	}
}