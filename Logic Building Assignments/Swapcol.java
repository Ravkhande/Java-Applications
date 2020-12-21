
/*
Write a java program which accept matrix from user and swap the
contents of each consecutive columns. 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
      public void SwapCol(int Arr[][],int iRow,int iCol)
      {
          int iStart=0,iEnd=0,temp=0;

          for(int i=0;i<iRow;i++)
          {

          	if(iEnd<iCol)
          	{
          		iEnd++;
          	}
            

          	while((iStart<iEnd) && (iEnd<iCol))
          	{
               temp=Arr[i][iStart];
               Arr[i][iStart]=Arr[i][iEnd];
               Arr[i][iEnd]=temp;
               
              iStart=iStart+2;
              iEnd=iEnd+2;

          	}

          	iStart=0;
          	iEnd=0;
            

          }

     System.out.println("Swap content of Coiumn is :");
	for(int i=0;i<iRow;i++)
	{
		for(int j=0;j<iCol;j++)
		{
			System.out.print(Arr[i][j]+"\t");
		}
		System.out.println();
	}


      }
}


class Swapcol
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
	mobj.SwapCol(arr,row,col);
}
}
