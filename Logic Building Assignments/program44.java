
/*
 Write a program which accept matrix and display addition of elements From each
column.
Input :


     3 2 5 9
     4 3 2 2
     8 4 1 9
     3 9 7 5


Output : 18 18 15 25 
*/


import java.lang.*;
import java.util.*;

class Matrix
{
    public void AddColumn(int Arr[][], int iRow, int iCol)
   {
          int iSum=0;
		  for(int j=0;j<iCol;j++)
		  {
			  iSum=0;
			  for(int i=0;i<iRow;i++)
			  {
				  iSum=iSum+Arr[i][j];
			  }
			  
			   System.out.println();
			  System.out.println("Addition of elements From Column : "+j+" is " + iSum);
		  }
		  
    } 
}

class Fourth
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
	
	mobj.AddColumn(arr,row,column);
	
	}
}
