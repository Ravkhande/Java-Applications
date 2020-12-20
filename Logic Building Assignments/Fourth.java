
//Not done
/*
 Write a program which accept matrix and check whether the matrix is
identity matrix or not.

Identity matrix is a square matrix with 1’s along the diagonal from upper left to
lower right and 0’s in all other positions.
If it satisfies the structure as explained before then the matrix is called as
identity matrix. 

Input :
       1 0 0 0
       0 1 0 0
       0 0 1 0
       0 0 0 1

Output : True

*/

import java.lang.*;
import java.util.*;

class Matrix
{
boolean ChkIdentity(int Arr[][], int iRow, int iCol)
{
	int i=0,j=0;

for(i=0;i<iRow-1;i++)
{
	for(j=0;j<iCol-1;j++)
	{

		if(((i==j) && (Arr[i][j]!=1)) || ((i!=j) && (Arr[i][j]!=0)))
		{
			break;
		}
	}

	}

    if(((i==j) && (Arr[i][j]!=1)) || ((i!=j) && (Arr[i][j]!=0)))
	{
		return false;
	}
	else
	{	
	 return true;
		
	}
	
   
}


}


class Fourth
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

bRet=mobj.ChkIdentity(arr,row,col);
   if(bRet==true)
   {
	   System.out.println("Matrix is Identity matrix");
   }
   else
   {
	   System.out.println("Matrix is not Indentity matrix");
   }
}
}

	

