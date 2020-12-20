
/*
 Write a program which accept matrix and return largest number from both the
diagonals

Input :

   3 2 5 9
   4 3 2 2
   8 4 1 9
   3 9 7 5


Output : 9 

*/

import java.lang.*;
import java.util.*;

class Matrix
{
int MaxDiagonal(int Arr[][], int iRow, int iCol)
{
     int iMax1,iMax2;
	 
	 iMax1=Arr[0][0];
	 for(int i=0;i<iRow;i++)
	 {
		 for(int j=0;j<iCol;j++)
		 {
			 if(i==j)
			 {
				  if(iMax1<Arr[i][j])
				 {
					 iMax1=Arr[i][j];
				 }
			 }
		 }
	 }
	 
	 System.out.println("Largest number from first diagonal is : " + iMax1);
	 
	 iMax2=Arr[0][3];
	 for(int i=iRow-1;i>=0;i--)
	 {
		 for(int j=0;j<iCol;j++)
		 {
			 if(i==j)
			 {
				 if(iMax2<Arr[i][j])
				 {
					 iMax2=Arr[i][j];
				 }
			 }
		 }
	 }
	 
	 System.out.println("Largest number from second diagonal is : " + iMax2);
	 
	 if(iMax1>iMax2)
	 {
		 return iMax1;
	 }
	 else
	 {
		 return iMax2;
	 }
	 
} 

}

class Third
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
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array with index :" + i);
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter elements are : "+i+" , "+j);
				arr[i][j]=sobj.nextInt();
			}
		}
		
		int iRes=mobj.MaxDiagonal(arr,row,col);
		System.out.println("Largest number from both diagonals is : "+ iRes);
		
	}
}
