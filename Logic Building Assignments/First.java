
/* 
Write a program which accept matrix from user and return addition of diagonal
elements.
Input :

3 2 5 9
4 3 2 2
8 4 1 5
3 9 7 5

Output : 12 

*/

import java.lang.*;
import java.util.*;

class Matrix
{
int AddDiagonal(int Arr[][], int iRow, int iCol)
{
      int iSum=0;
	  for(int i=0;i<iRow;i++)
	  {
		  for(int j=0;j<iCol;j++)
		  {
			  if(i==j)
			  {
				  
			  iSum=iSum+Arr[i][j];
			  }
		  }
	  }
	  
	  return iSum;
				  
}
}

class First
{
	public static void main(String args[])
	{
		
	Matrix mobj=new Matrix();
	Scanner sobj=new Scanner(System.in);
	System.out.println("Enter rows:");
	int row=sobj.nextInt();
	
	System.out.println("Enter columns:");
	int column=sobj.nextInt();
	
	int arr[][]=new int[row][column];
	
	System.out.println("Entered the elements :");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Row with index : " +i);
		for(int j=0;j<arr[i].length;j++)
		{
		   System.out.println("Enter elements are : "+i+","+j);		   
			arr[i][j]=sobj.nextInt();
		}
	}
	
	int iRes=mobj.AddDiagonal(arr,row,column);
	System.out.println("Addition of Diagonal elements are : " + iRes);
	
	}
}

	
	
