
/*
 /
 Write a program which accept matrix and check whether the matrix is
Sparse matrix or not.
Sparse matrix is a matrix with the majority of its elements equal to zero. 


Input :

1 0 3 0
0 6 0 0
0 0 1 0
9 0 0 9

Output : True
*/

import java.lang.*;
import java.util.*;

class Matrix
{
boolean ChkSparse(int Arr[][], int iRow, int iCol)
{
	int i=0,j=0;
	for(i=0;i<iRow-1;i++)
	{
		for(j=0;j<iCol-1;j++)
		{
			if(Arr[i][j]!=0)
			{
				break;
			}
		}
	}

	if(Arr[i][j]!=0)
	{
		return false;
	}
	else
	{
		return true;
	}


}

}


class Fifth
{
public static void main(String args[])
{
	boolean bRet=false;
Matrix mobj=new Matrix();
Scanner sobj=new Scanner(System.in);
System.out.println("Enter the rows:");
int row=sobj.nextInt();
System.out.println("Enter the columns:");
int col=sobj.nextInt();


int arr[][]=new int[row][col];

System.out.println("Entered elements are :");
for(int i=0;i<row;i++)
{
	System.out.println("Row with index :" + i);
	for(int j=0;j<col;j++)
	{
		System.out.println("Enter elements are : " +i+","+j);
		arr[i][j]=sobj.nextInt();
	}
}

bRet=mobj.ChkSparse(arr,row,col);
   if(bRet==true)
   {
	   System.out.println("Matrix is Sparse matrix");
   }
   else
   {
	   System.out.println("Matrix is not Sparse matrix");
   }
}
}

	

