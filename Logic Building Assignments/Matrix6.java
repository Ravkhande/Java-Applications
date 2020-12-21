

/*
Write a program which accept matrix from user and display transpose of the
matrix.

The transpose of a given matrix is formed by interchanging the rows and
columns of a matrix. 

Input :
     3 2 5 9
     4 3 2 2
     8 4 1 5
     3 9 7 5
Output :

     3 4 8 3
     2 3 4 9
     5 2 1 7
     9 2 5 5
	 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
void Transpose(int Arr[][], int iRow, int iCol)
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

class Matrix6
{
public static void main(String args[])
{
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

mobj.Transpose(arr,row,col);
}
}
	
