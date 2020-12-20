// Not done
/*

 Write a program which accept matrix and reverse the contents of each
column.
Input :

     3 2 5 9
     4 3 2 2
     8 4 1 9
     3 9 7 5
Output :
     3 9 7 5
     8 4 1 9
     4 3 2 2
     3 2 5 9
	 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	void ReverseCol(int Arr[][], int iRow, int iCol)
    {
    	 int iStart=0,iEnd=0,temp=0;
	
		for(int j=0;j<iCol;j++)
		{
			while(iEnd<iRow)
	        {
		         iEnd++;
	         }
			 
			 iEnd--;
			 
			while(iStart<iEnd)
			{
				temp=Arr[iStart][j];
				Arr[iStart][j]=Arr[iEnd][j];
				Arr[iEnd][j]=temp;
			    iStart++;
				iEnd--;
				
			}
			iStart=0;
			iEnd=0;
			temp=0;
		}
		
	
	
	System.out.println("Reversed content of each column matrix is :");
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

class Third
{
	public static void main(String args[])
	{
		Matrix mobj=new Matrix();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the rows :");
		int row=sobj.nextInt();
		
		System.out.println("Enter the columns :");
		int col=sobj.nextInt();
		
		int arr[][]=new int[row][col];
		
		System.out.println("Entered elements are :");
		for(int i=0;i<row;i++)
		{
			System.out.println("Row with index : "+i);
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter elements is : "+i+" , "+j);
				arr[i][j]=sobj.nextInt();
			}
		}
		
		mobj.ReverseCol(arr,row,col);
		
	}
}
		
