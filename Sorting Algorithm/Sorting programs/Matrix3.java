
// Selection sort menu driven program 

import java.lang.*;
import java.util.*;

class MatrixData
{

	public void Sort(int brr[][],int choice)
	{

         for(int i=0;i<brr.length;i++)
         {
         	int arr[]=brr[i];
		for(int pass=0;pass<arr.length-1;pass++)
		{
			int Index_Min=pass;

			switch(choice)
			{
				case 1:
			for(int j=pass+1;j<arr.length;j++)
			{
                if(arr[Index_Min]>arr[j])
                {
                	Index_Min=j;
                }
			}

			break;

			case 2:
			for(int j=pass+1;j<arr.length;j++)
			{
                if(arr[Index_Min]<arr[j])
                {
                	Index_Min=j;
                }
			}

			break;

		}

		if(arr[pass]!=arr[Index_Min])
		{
			int temp=arr[pass];
			arr[pass]=arr[Index_Min];
			arr[Index_Min]=temp;
		}

		}
	}


	}

}

class Matrix3
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int row=sobj.nextInt();

        System.out.println("Enter the number of columns :");
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

		System.out.println("\nEnter in which order sorting Required : ");
		System.out.println("___________________________________________");
		System.out.println("1: Increasing order");
		System.out.println("2: Decresing order");
		System.out.println("____________________________________________");
		int choice=sobj.nextInt();

		MatrixData mobj=new MatrixData();
		mobj.Sort(arr,choice);

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