
/*
Write a program which accept matrix and reverse the contents of each row.
Input : 
     3 2 5 9
     4 3 2 2
     8 4 1 9
     3 9 7 5
	 
output: 

     9 5 2 3
     2 2 3 4
     9 1 4 8
     5 7 9 3

*/

import java.lang.*;
import java.util.*;

class Matrix
{
void ReverseRow(int Arr[][], int iRow, int iCol)
{
     int iStart=0,iEnd=0,temp=0;
	
		for(int i=0;i<iRow;i++)
		{
			while(iEnd<iCol)
	        {
		         iEnd++;
	         }
			 
			 iEnd--;
			 
			while(iStart<iEnd)
			{
				temp=Arr[i][iStart];
				Arr[i][iStart]=Arr[i][iEnd];
				Arr[i][iEnd]=temp;
			    iStart++;
				iEnd--;
				
			}
			iStart=0;
			iEnd=0;
			temp=0;
		}
		
	
	
	System.out.println("Reversed content of each row matrix is :");
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

class Matrix7
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

mobj.ReverseRow(arr,row,col);
}
}
	
