
/*
Write a java program which accept matrix from user and return
addition of border elements of matrix.
*/

import java.lang.*;
import java.util.*;

class Matrix
{
      public int Border(int Arr[][],int iRow,int iCol)
      {
          int iSum=0;
          for(int i=0;i<iRow;i++)
          {
          	for(int j=0;j<iCol;j++)
          	{
          		if((i==0) || (j==0) || (i==iRow-1) || (j==iCol-1))
          		{
          			iSum=iSum+(Arr[i][j]);
          		}
          	}
          }

          return iSum;
          
      }
}


class Matrix11
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
	int iRes=mobj.Border(arr,row,col);
	System.out.println("Addition of Border elements is : " + iRes);
}

}
