import java.lang.*;
import java.util.*;

class Selection
{
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

class Matrix extends Selection
{
	public void RowSort(int brr[][])
	{
		int i = 0, j = 0, temp = 0, min_i = 0,pass = 0;
		
		for(i = 0; i <brr.length; i++)
		{
				int arr[] = brr[i];
				// Selection sort
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





























