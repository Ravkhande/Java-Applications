// Accept matrix from user and display largst number from each row 

/*
Row = 4
Column = 4

2 Dimentional array

Input :
3	1	2	1
4	5	6	7
3	2	8	9
7	8	9	5

Output:
3
7
9
9
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	void MaxRow(int arr[][])
	{
		int imax= 0;

		for(int i = 0; i< arr.length; i++)
		{
			imax = arr[i][0];
			for(int j = 0; j< arr[i].length; j++)
			{
				if(arr[i][j] > imax)
				{
					imax = arr[i][j];
				}
			}
			System.out.println("Largest of row no : "+i +"is : "+imax);
		}
	}
}

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();

		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter the elements");

		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Row with index : "+i);
			for(int j = 0; j< arr[i].length; j++)
			{
				System.out.println("Enter the element :"+i+" , "+j);
				arr[i][j] = sobj.nextInt();
			}
		}
		Matrix mobj = new Matrix();
		mobj.MaxRow(arr);
	}
}






















