
/*
Write a java program which accept matrix from user and return its
transpose matrix.The transpose of a given matrix is formed by
interchanging the rows and columns of a matrix. 

*/

import java.lang.*;
import java.util.*;

class Matrix
{
      public void Transpose(int Arr[][],int iRow,int iCol)
      {
          
          System.out.println("Transpose matrix is :");
	for(int j=0;j<iCol;j++)
	{
		for(int i=0;i<iRow;i++)
		{
			System.out.print(Arr[i][j]+"\t");
		}
		System.out.println();
	}


      }
}


class Tran
{
	public static void main(String args[])
	{

	Scanner sobj=new Scanner(System.in);
	System.out.println("Enter the rows : ");
	int row=sobj.nextInt();

	System.out.println("Enter the columns : ");
	int col=sobj.nextInt();

	int arr[][]=new int[row][col];

	System.out.println("Enter the Elements :");
	for(int i=0;i<row;i++)
	{
		System.out.println("Row with index : "+ i);
		for(int j=0;j<col;j++)
		{
			System.out.println("Enter the elements : "+i+","+j);
			arr[i][j]=sobj.nextInt();
		}
	}

	Matrix mobj=new Matrix();
	mobj.Transpose(arr,row,col);
}
}
