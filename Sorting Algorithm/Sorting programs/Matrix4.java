
// Program to sort alterate rows in increasing and decreasing order

import java.lang.*;
import java.util.*;

class MatrixData
{
	public void SortRow(int brr[][])
	{
		int iCnt=0,pass=0,k=0,i=0;
		for(i=0;i<brr.length;i++)
		{
			int arr[]=brr[i];

			for(pass=0;pass<arr.length-1;pass++)
			{
				int Index_Min=pass;

			if((iCnt%2)==0)
            {
					for(k=pass+1;k<arr.length;k++)
					{
						if(arr[Index_Min]>arr[k])           // sort in increasing order
						{
							Index_Min=k;
						}
					}

			}
			else if((iCnt%2)!=0)
			{
				for(k=pass+1;k<arr.length;k++)
					{
						if(arr[Index_Min]<arr[k])         // sort in decreasing order
						{
							Index_Min=k;
						}
					}

				}

				if(arr[pass]!=arr[Index_Min])
				{
					int temp=arr[pass];
					arr[pass]=arr[Index_Min];
					arr[Index_Min]=temp;
				}
				
		}

		iCnt++;
		} 

	}

}

class Matrix4
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
		mobj.SortRow(arr);

		System.out.println("Elements of matrix after complete sorting is : ");
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